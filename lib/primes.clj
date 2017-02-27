(load-file "lib/arithmetic.clj")

(defn prime? [n]
  (or
    (= n 2)
    (and
      (not (div? n 2))
      (->> (range 3 (inc (Math/sqrt n)) 2)
           (not-any? #(div? n %))))))

(defn primes-below [limit]
  (->> (cons 2 (range 3 limit 2))
       (filter prime?)))

(defn nth-prime [n]
  (-> (primes-below Long/MAX_VALUE)
       (nth (dec n))))

(defn smallest-prime-factor [n]
  (if (prime? n)
    n
    (->> (range 2 (inc (/ n 2)))
         (filter #(div? n %))
         first)))

; For the given number:
; 1. Find the smallest possible divisor
; 2. Divide the number by that divisor
; 3. ……………
; 4. Keep going until the resulting number is 1
; 5. Return the largest required divisor
(defn largest-prime-factor
  ([number] (largest-prime-factor number 1))
  ([number, largest-factor]
   (if (= number 1)
     largest-factor
     (let [factor (smallest-prime-factor number)]
       (largest-prime-factor
         (/ number factor)
         (max largest-factor factor))))))
