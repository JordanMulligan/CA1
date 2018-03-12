// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/ca1/conf/routes
// @DATE:Mon Mar 12 08:24:38 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
