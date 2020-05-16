(ns mastermind.core-test
  (:require [clojure.test :refer :all]
            [mastermind.core :refer :all]))

(deftest score-test
  (testing "score guess with not matches"
    (is (= (score [0 0 0 0] [1 1 1 1]) []))))

(deftest score-test
  (testing "score guess with not matches"
    (is (= (score [0 0 0 0] [0 1 1 1]) [1]))))  

(deftest score-test
  (testing "score guess with not matches"
    (is (= (score [0 0 0 0] [0 1 1 0]) [2]))))