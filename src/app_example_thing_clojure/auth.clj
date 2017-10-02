(ns app-example-thing-clojure.auth
  (:use
    [app-example-thing-clojure.util :only [access-denied]]))


(defn api-key [handler]
  (fn [r]
    (if (= ((r :headers) "api-key") "silly")
      handler
      access-denied)))
