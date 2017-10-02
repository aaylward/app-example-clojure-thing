(ns app-example-thing-clojure.handlers
  (:use 
    [app-example-thing-clojure.util :only [ok]]
    [app-example-thing-clojure.auth :only [api-key]]))


(defn get-message [request] (api-key ok))

