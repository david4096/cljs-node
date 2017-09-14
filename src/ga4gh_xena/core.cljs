(ns ga4gh-xena.core
    (:require [cljs.nodejs :as nodejs]))

(defn -main []
  (.log js/console "hi"))

(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)
