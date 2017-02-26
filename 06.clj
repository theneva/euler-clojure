(defn square [n] (* n n))

(defn sum-up [coll] (reduce + coll))

(defn sum-of-squares [limit]
  (->> (range 1 (inc limit))
       (map square)
       sum-up))

(defn square-of-sum [limit]
  (->> (range 1 (inc limit))
       sum-up
       square))

(def limit 100)

(def sum (sum-of-squares limit))
(def square (square-of-sum limit))
(def diff (- square sum))

(str square " - " sum " = " diff)
