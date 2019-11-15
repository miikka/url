(defproject miikka/url "0.1.2-SNAPSHOT"
  :description "Makes working with URLs in Clojure a little more pleasant."
  :url "http://github.com/miikka/url"
  :scm {:name "git"
        :url "https://github.com/miikka/url"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [pathetic "0.5.1"]]
  :aliases  {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "0.0-554"]
                                     [lambdaisland/kaocha-cljs "0.0-59"]]}})
