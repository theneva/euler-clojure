(defn square [n] (* n n))

(for [a (range 500)
      b (range 500)
      c (range 500)
      :when (< a b c)
      :when (= 1000 (+ a b c))
      :when (= (square c) (+ (square a) (square b)))]
  (* a b c))
