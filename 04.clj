(defn palindromic? [n]
  (let [s (str n)]
    (= s (clojure.string/reverse s))))

(->> (for [x (range 100 1000)
           y (range 100 1000)]
       (* x y))
     (filter palindromic?)
     (reduce max))
