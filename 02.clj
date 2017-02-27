(load-file "lib/series.clj")

(->> (range)
     (map inc)
     (map fib)
     (take-while #(< % 4000000))
     (filter even?)
     (reduce +))
