(ns mastermind.core
  (:gen-class))

(defn score 
  [code, guess]
    (if (= (first code) (first guess))
      [:pos]
      []))
