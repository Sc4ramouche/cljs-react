# Minimalistic ClojureScript Example

Based on the [Quick Start guide](https://clojurescript.org/guides/quick-start), with little tweaks.

- Dev REPL – `clj -M --main cljs.main --compile cljs-minimal.core --repl`
- Production build – `clj -M -m cljs.main --optimizations advanced -c cljs-minimal.core`
  - Serve production build – `clj -M -m cljs.main --serve`

### TODOs

- How do I restart REPL properly?
  - (require '[cljs-minimal.core :as cljs] :reload)
- How `.setAttribute` is different from `!set` macro?
- How does `goog.dom` and `goog.events` differ from the barebone DOM API in ClojureScript?
