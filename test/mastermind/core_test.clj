(ns mastermind.core-test
  (:require [clojure.test :refer :all]
            [mastermind.core :refer :all]))

(deftest score-test
  (testing "score guess with no matches"
    (is (= (score [0 0 0 0] [1 1 1 1]) [0 0]))))

(deftest score-test
  (testing "score guess with one match"
    (is (= (score [0 0 0 0] [0 1 1 1]) [1 0]))))  

(deftest score-test
  (testing "score guess with two matches"
    (is (= (score [0 0 0 0] [0 1 1 0]) [2 0]))))

(deftest score-test
  (testing "score guess with one good digit in wrong position"
    (is (= (score [0 1 2 3] [4 5 6 0]) [0 1]))))  