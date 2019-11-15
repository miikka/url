(defproject miikka/url "0.1.2-SNAPSHOT"
  :description "Makes working with URLs in Clojure a little more pleasant."
  :url "http://github.com/miikka/url"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [pathetic "0.5.1"]]
  :aliases  {"cleantest" ["do" "clean," "cljx" "once," "test,"
                          "cljsbuild" "once," "cljsbuild" "test"]}
  :profiles {:dev {:dependencies [[com.cemerick/clojurescript.test "0.0.4"]
                                  [com.cemerick/piggieback "0.0.5"]]
                   :plugins [[lein-cljsbuild "0.3.2"]]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
  :cljsbuild {:builds [{:source-paths ["target/generated-src" "target/generated-test"]
                        :compiler {:output-to "target/cljs/testable.js"}
                        :optimizations :whitespace
                        :pretty-print true}]
              :test-commands {"unit-tests" ["runners/phantomjs.js" "target/cljs/testable.js"]}})
