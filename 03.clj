(defn div? [x y] (= 0 (mod x y)))

(defn prime? [n]
  (or
    (= n 2)
    (and
      (not (div? n 2))
      (->> (range 3 (inc(/ n 2)) 2)
           (filter odd?)
           (not-any? #(div? n %))))))

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

(largest-prime-factor 600851475143)
