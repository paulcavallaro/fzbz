(ns fzbz.core)

(def naturals
  (iterate inc 1))

(defn fzbz [x]
  :doc "FizzBuzz returns the appropriate FizzBuzz sequence."
  (map (fn [n]
         (cond (== 0 (mod n 15)) "FizzBuzz"
               (== 0 (mod n 3)) "Fizz"
               (== 0 (mod n 5)) "Buzz"
               :else n))
       (take x naturals)))

(def fzbz-seq
  (map (fn [n]
         (cond (== 0 (mod n 15)) "FizzBuzz"
               (== 0 (mod n 5)) "Buzz"
               (== 0 (mod n 3)) "Fizz"
               :else n))
       naturals))

(defn print-fzbz [x]
  :doc "Prints the darn thing."
  (println (reduce (fn [h rst] (str h "\n" rst)) (fzbz x))))

(defn print-fzbz2 [x]
  :doc "Using lazy sequences this time"
  (println (reduce
            (fn [h rst] (str h "\n" rst))
            (take x fzbz-seq))))
