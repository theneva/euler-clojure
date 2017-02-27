(defn div? [x y] (= 0 (mod x y)))

(defn divisible-by-all [number]
  (do
    (->> divisors
         (remove #(div? number %))
         (empty?))))

(defn square [n] (* n n))
