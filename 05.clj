(def divisors (range 11 21))

(defn divisible-by-all [number]
  (do
    (->> divisors
         (map #(mod number %))
         (every? #(= 0 %)))))

(->> (range 20 Long/MAX_VALUE 20)
     (filter divisible-by-all)
     first)

