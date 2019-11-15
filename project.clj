(defproject miikka/url "0.1.3-SNAPSHOT"
  :description "Makes working with URLs in Clojure a little more pleasant."
  :url "http://github.com/miikka/url"
  :scm {:name "git"
        :url "https://github.com/miikka/url"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[pathetic "0.5.1"]]
  :aliases  {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]]}
             :kaocha {:dependencies [[lambdaisland/kaocha "0.0-554"]
                                     [lambdaisland/kaocha-cljs "0.0-59"]
                                     [lambdaisland/kaocha-junit-xml "0.0-70"]
                                     [lambdaisland/kaocha-cloverage "0.0-41"]]}})
