(load-file "lib/arithmetic.clj")

(->> (range 1 1000)
     (filter #(or (div? % 3) (div? % 5)))
     (reduce +))
