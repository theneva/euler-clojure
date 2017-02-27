(load-file "lib/arithmetic.clj")

(def divisors (range 11 21))

(->> (range 20 Long/MAX_VALUE 20)
     (filter divisible-by-all)
     first)
