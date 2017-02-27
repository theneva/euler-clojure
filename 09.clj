(defn square [n] (* n n))

(->> (for [a (range 10)
           b (range 10)
           c (range 10)]
       {:a a
        :b b
        :c c})
     (filter #(< (% :a) (% :b) (% :c)))
     (filter #(= 25 (+ (% :a) (% :b) (% :c))))
     (map #(prn (square (% :c))))
     (filter #(= (square (% :c)) (+ (square (% :a)) (square (% :b)))))
     prn)
;      (filter #(= 1000 (+ :a % :b % :c %)))
;      (prn))
