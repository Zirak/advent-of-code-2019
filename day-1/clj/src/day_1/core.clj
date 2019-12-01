(ns day-1.core
  (:require [clojure.java.io :as io]))

(defn mfuel [m]
  (max 0 (- (bigint (/ m 3)) 2)))

(defn fuel [m]
  (let [n-fuel (mfuel m)]
    (if (<= n-fuel 0)
      0
      (+ n-fuel (fuel n-fuel)))))

(defn -main [& args]
  (with-open [inp (io/reader (io/resource "input"))]
    (println (->> (line-seq inp)
        (map #(Integer. %1))
        (map fuel)
        (reduce +)))))
