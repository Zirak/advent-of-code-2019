(ns day-1.core-test
  (:require [clojure.test :refer :all]
            [day-1.core :refer :all]))

(deftest fuel-12
  (is (= 2
         (mfuel 12))))

(deftest fuel-14
  (is (= 2
         (mfuel 14)))
  (is (= 2
         (fuel 14))))

(deftest fuel-1969
  (is (= 654
         (mfuel 1969)))
  (is (= 966
         (fuel 1969))))

(deftest bigger
  (is (= 33583
         (mfuel 100756)))
  (is (= 50346
         (fuel 100756))))
