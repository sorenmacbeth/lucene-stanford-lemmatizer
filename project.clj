(defproject org.clojars.sorenmacbeth/lucene-standford-lemmatizer "0.1-SNAPSHOT"
  :java-source-path "src"
  :javac-options {:debug "true" :fork "true"}
  :dependencies [[org.apache.lucene/lucene-core "3.4.0"]
                 [edu.stanford.nlp/stanford-corenlp "1.2.0"]
                 [com.google.guava/guava "10.0"]]
  :dev-dependencies [])

