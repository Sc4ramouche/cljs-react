(ns cljs-minimal.core)

(defn on-click [event]
  (js/alert "Clicked!"))

(defn create-button []
  (let [button (.createElement js/document "input")]
    (.setAttribute button "type" "button")
    (.setAttribute button "value" "Call Alert")
    (.addEventListener button "click" on-click)
    button))

(let [app (.getElementById js/document "app")]
  (.appendChild app (create-button)))
