
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Projects],List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Projects], categories: List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Projects",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee ProjectsP</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Projects</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Projects</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProjects.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Projects</t> 
        </tr>
      </thead>

      <tbody>
        """),_display_(/*35.10*/for(p<-projects) yield /*35.26*/ {_display_(Seq[Any](format.raw/*35.28*/("""
          """),format.raw/*36.11*/("""<tr>
            <td class="numeric">"""),_display_(/*37.34*/p/*37.35*/.getId),format.raw/*37.41*/("""</td>
            <td>"""),_display_(/*38.18*/p/*38.19*/.getName),format.raw/*38.27*/("""</td>
            <td>"""),_display_(/*39.18*/p/*39.19*/.getProjects.getName),format.raw/*39.39*/("""</td>        
            
            <td>
              <a href=""""),_display_(/*42.25*/routes/*42.31*/.HomeController.updateProject(p.getId)),format.raw/*42.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*46.25*/routes/*46.31*/.HomeController.deleteProject(p.getId)),format.raw/*46.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*51.10*/("""
      """),format.raw/*52.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*57.17*/routes/*57.23*/.HomeController.addProject()),format.raw/*57.51*/("""">
        <button class="btn btn-primary">Add a project</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*63.2*/("""
"""))
      }
    }
  }

  def render(projects:List[models.Projects],categories:List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,categories,user)

  def f:((List[models.Projects],List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,categories,user) => apply(projects,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 08:24:38 GMT 2018
                  SOURCE: /home/wdd/webapps/ca1/app/views/index.scala.html
                  HASH: 3af920ecb4a4c8876e6c66c14a4d37ce6ffbf3f2
                  MATRIX: 1005->1|1194->97|1221->99|1250->120|1289->122|1317->124|1498->278|1513->284|1558->308|1634->358|1670->378|1710->380|1746->389|1783->399|1798->405|1849->435|1903->462|1913->463|1942->471|1981->482|2029->503|2039->504|2079->523|2137->551|2169->556|2313->674|2354->706|2394->708|2430->717|2502->762|2516->767|2552->782|2588->791|2632->805|2666->812|2841->960|2873->976|2913->978|2952->989|3017->1027|3027->1028|3054->1034|3104->1057|3114->1058|3143->1066|3193->1089|3203->1090|3244->1110|3339->1178|3354->1184|3413->1222|3610->1392|3625->1398|3684->1436|3904->1625|3938->1632|4013->1680|4028->1686|4077->1714|4210->1817
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|47->16|48->17|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|56->25|57->26|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|73->42|73->42|73->42|77->46|77->46|77->46|82->51|83->52|88->57|88->57|88->57|94->63
                  -- GENERATED --
              */
          