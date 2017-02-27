(def fib
  (memoize
    (fn [n]
      (if (< n 3)
        n
        (+
          (fib (- n 2))
          (fib (- n 1)))))))
