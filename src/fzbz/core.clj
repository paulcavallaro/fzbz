(ns fzbz.core)

(def naturals
  (iterate inc 1))

(defn fzbz [x]
  :doc "FizzBuzz returns the appropriate FizzBuzz sequence."
  (map (fn [n]
         (cond (== 0 (rem n 15)) "FizzBuzz"
               (== 0 (rem n 3)) "Fizz"
               (== 0 (rem n 5)) "Buzz"
               :else n))
       (take x naturals)))

(defn print-fzbz [x]
  :doc "Prints the darn thing."
  (println (reduce (fn [h rst] (str h "\n" rst)) (fzbz x))))
