(defn div? [x y] (= 0 (mod x y)))

(defn prime? [n]
  (or
    (= n 2)
    (and
      (not (div? n 2))
      (->> (range 3 (inc (Math/sqrt n)) 2)
           (not-any? #(div? n %))))))

(defn primes-below [limit]
  (->> (cons 2 (range 3 limit 2))
       (filter prime?)))

(->> (primes-below 2000000)
     (reduce +))
