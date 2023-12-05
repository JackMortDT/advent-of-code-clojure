(ns advent-of-code.2015.day1-test
  (:require [clojure.test :refer :all]
            [advent-of-code.2015.day1 :as day1]))

(deftest what-floor-is-santa
  (testing "(()) result in floor 0")
  (is (= (day1/what-floor) 0)))
