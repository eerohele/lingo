(defproject com.exoscale/lingo "1.0.0-alpha1-SNAPSHOT"

  :description "exoscale spec explain utils"

  :license {:name "ISC"}

  :url "https://github.com/exoscale/lingo"

  :dependencies [[org.clojure/clojure "1.10.2"]]

  :global-vars {*warn-on-reflection* true}

  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy" "clojars"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]])
