
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Project",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Project</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),format.raw/*7.37*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.85*/("""
        """),_display_(/*11.10*/select(
            projectForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a Department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*16.10*/("""
       

        """),_display_(/*19.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.74*/("""

        """),format.raw/*21.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Project" class="btn btn-primary">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.index(0)),format.raw/*23.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*27.6*/("""
""")))}))
      }
    }
  }

  def render(projectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 08:24:38 GMT 2018
                  SOURCE: /home/wdd/webapps/ca1/app/views/addProject.scala.html
                  HASH: b9002a7fa62561874383f330bf45e74764376cf0
                  MATRIX: 985->1|1118->63|1162->79|1189->81|1221->105|1260->107|1291->112|1359->155|1467->254|1507->256|1543->293|1579->303|1591->307|1621->317|1659->328|1755->403|1792->413|2057->657|2103->676|2188->740|2225->750|2381->879|2396->885|2441->909|2589->1027
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|41->10|41->10|42->11|47->16|50->19|50->19|52->21|54->23|54->23|54->23|58->27
                  -- GENERATED --
              */
          