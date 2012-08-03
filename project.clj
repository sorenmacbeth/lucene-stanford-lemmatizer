(defproject org.clojars.sorenmacbeth/lucene-stanford-lemmatizer "0.1.5"
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true" :deprecation "true"}
  :dependencies [[org.apache.lucene/lucene-core "4.0.0-ALPHA"]
                 [edu.stanford.nlp/stanford-corenlp "1.3.2"]
                 [com.google.guava/guava "10.0"]]
  :dev-dependencies [])

