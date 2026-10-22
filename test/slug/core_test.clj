(ns slug.core-test
  (:require
   [clojure.test :refer [deftest is]]
   [slug.core :as slug]))

(deftest slugify-test
  (is (= "hello-world" (slug/slugify "Hello, World!")))
  (is (= "release-2-0" (slug/slugify "  Release 2.0  ")))
  (is (= "" (slug/slugify "!!!"))))
