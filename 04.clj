(load-file "lib/strings.clj")

(->> (for [x (range 100 1000)
           y (range 100 1000)]
       (* x y))
     (filter #(palindromic? (str %)))
     (reduce max))
