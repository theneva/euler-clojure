(defn div? [x y] (= 0 (mod x y)))

(defn prime? [n]
  (or
    (= n 2)
    (and
      (not (div? n 2))
      (->> (range 3 (inc(/ n 2)) 2)
           (not-any? #(div? n %))))))

(def index 10001)

(nth
  (->> (range 3 Long/MAX_VALUE 2)
     (filter prime?))
  (dec (dec index))) ; decrease twice to account for not including 2
