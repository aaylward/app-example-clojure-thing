(ns app-example-thing-clojure.core
  (:use 
        [app-example-thing-clojure.handlers :only [get-message]]
        [app-example-thing-clojure.util :only [error]]
        [ring.adapter.jetty :only [run-jetty]]
        [compojure.core     :only [defroutes GET]])
  (:require [compojure.route :as route])
  (:gen-class))

(defroutes routes
  (GET "/" [] get-message)
  (route/not-found (fn [r] (error 404 "not found"))))

(defn -main []
  (run-jetty routes {:port 3000}))

