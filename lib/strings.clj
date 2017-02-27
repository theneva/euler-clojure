(defn palindromic? [string]
    (= string (clojure.string/reverse string)))
