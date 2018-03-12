
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Employees",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Our Employees</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*25.6*/for(e<-employee) yield /*25.22*/ {_display_(Seq[Any](format.raw/*25.24*/("""
      """),format.raw/*26.7*/("""<tr>
        <td class="numeric">"""),_display_(/*27.30*/e/*27.31*/.getId),format.raw/*27.37*/("""</td>
        <td>"""),_display_(/*28.14*/e/*28.15*/.getName),format.raw/*28.23*/("""</td>
        <td>"""),_display_(/*29.14*/e/*29.15*/.getEmail),format.raw/*29.24*/("""</td>
        <td>
          <a href=""""),_display_(/*31.21*/routes/*31.27*/.HomeController.updateEmployee(e.getId)),format.raw/*31.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>  
        <td>
          <a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.deleteEmployee(e.getId)),format.raw/*36.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*41.6*/("""
  """),format.raw/*42.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*46.13*/routes/*46.19*/.HomeController.addEmployee()),format.raw/*46.48*/("""">
    <button class="btn btn-primary">Add an Employee</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(employees:List[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 08:24:38 GMT 2018
                  SOURCE: /home/wdd/webapps/ca1/app/views/employee.scala.html
                  HASH: 5171296a00003973b827427b9e1a47efb2b0b00b
                  MATRIX: 984->1|1137->61|1164->63|1194->85|1233->87|1261->89|1322->125|1362->157|1401->159|1430->162|1494->201|1507->206|1542->221|1572->224|1610->232|1639->234|1866->435|1898->451|1938->453|1972->460|2033->494|2043->495|2070->501|2116->520|2126->521|2155->529|2201->548|2211->549|2241->558|2307->597|2322->603|2382->642|2566->799|2581->805|2641->844|2840->1013|2870->1016|2932->1051|2947->1057|2997->1086
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|62->31|62->31|62->31|67->36|67->36|67->36|72->41|73->42|77->46|77->46|77->46
                  -- GENERATED --
              */
          