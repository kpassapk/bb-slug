(ns slug.core
  "Slugs for titles, as in a URL or a file name."
  (:require
   [clojure.string :as str]))

(defn slugify
  "TITLE as a slug: lower case, every run of characters other than a-z
  and 0-9 one dash, and no dash at either end."
  [title]
  (-> (str/lower-case title)
      (str/replace #"[^a-z0-9]+" "-")
      (str/replace #"^-|-$" "")))
