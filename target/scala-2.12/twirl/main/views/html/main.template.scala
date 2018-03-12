
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Web World - """),_display_(/*9.25*/title),format.raw/*9.30*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Web World</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Products" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">About</a>
                </li>

                <li """),_display_(/*30.22*/if(title=="Login")/*30.40*/{_display_(Seq[Any](format.raw/*30.41*/("""class="active"""")))}),format.raw/*30.56*/(""">
                    """),_display_(/*31.22*/if(user != null)/*31.38*/ {_display_(Seq[Any](format.raw/*31.40*/("""
                        """),format.raw/*32.25*/("""<a href=""""),_display_(/*32.35*/routes/*32.41*/.LoginController.logout()),format.raw/*32.66*/("""">Logout """),_display_(/*32.76*/user/*32.80*/.getName()),format.raw/*32.90*/("""</a>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<a href=""""),_display_(/*34.35*/routes/*34.41*/.LoginController.login()),format.raw/*34.65*/("""">Login</a>
                    """)))}),format.raw/*35.22*/("""

                """),format.raw/*37.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*47.18*/content),format.raw/*47.25*/("""
            """),format.raw/*48.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Web World</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("javascripts/main.js")),format.raw/*62.65*/(""""></script>
</body>

</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 08:24:38 GMT 2018
                  SOURCE: /home/wdd/webapps/ca1/app/views/main.scala.html
                  HASH: 5794598ebb817e5331add53225950bf64a5bf73e
                  MATRIX: 970->1|1120->58|1147->59|1266->152|1291->157|1503->342|1518->348|1580->389|1909->691|1940->713|1979->714|2025->729|2140->817|2167->835|2206->836|2252->851|2302->874|2327->890|2367->892|2420->917|2457->927|2472->933|2518->958|2555->968|2568->972|2599->982|2644->1009|2657->1014|2696->1015|2749->1040|2786->1050|2801->1056|2846->1080|2910->1113|2956->1131|3119->1267|3147->1274|3188->1287|3494->1566|3509->1572|3570->1612
                  LINES: 28->1|33->2|34->3|40->9|40->9|44->13|44->13|44->13|57->26|57->26|57->26|57->26|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|68->37|78->47|78->47|79->48|93->62|93->62|93->62
                  -- GENERATED --
              */
          