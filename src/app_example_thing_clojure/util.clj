(ns app-example-thing-clojure.util
  (:use 
    [ring.util.response :only [content-type response status]]
    [cheshire.core :only [generate-string]]))

(def APPLICATION_JSON "application/json")

(defn mapify [request]
  (loop [k (keys request) output {}]
    (if (empty? k)
      output
      (recur (rest k) (assoc output (first k) (str (request (first k))))))))

(defn json [body]
  (content-type (response (generate-string (mapify body))) APPLICATION_JSON))

(defn ok [body] json)

(defn error [code message]
  (status (json {:message message}) code))

(defn access-denied [request]
  (error 401, "access denied"))
