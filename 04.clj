(defn palindromic? [n]
  (let [s (str n)]
    (= s (clojure.string/reverse s))))

(->> (for [x (range 10 1000)
           y (range 10 1000)]
       (* x y))
     (filter palindromic?)
     (reduce max))
