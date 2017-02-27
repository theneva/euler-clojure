(load-file "lib/primes.clj")

(->> (primes-below 10)
     (reduce +))
