(def fib
  (memoize
    (fn [n]
      (if (< n 3)
        n
        (+
          (fib (- n 2))
          (fib (- n 1)))))))

(def limit 4000000) ; 4 million

(defn low-enough [n] (< n limit))

(->> (range)
     (map inc)
     (map fib)
     (take-while low-enough)
     (filter even?)
     (reduce +))
