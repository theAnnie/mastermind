(ns mastermind.core
  (:gen-class))

(defn score 
  [code, guess]
    [(reduce + (map #(if (= (first %) (second %)) 1 0) (partition 2 (interleave code guess))))]
    )
