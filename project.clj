(defproject app-example-thing-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"],
                 [compojure "1.6.0"],
                 [cheshire "5.8.0"],
                 [ring/ring-jetty-adapter "1.6.2"]]
  :main ^:skip-aot app-example-thing-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
