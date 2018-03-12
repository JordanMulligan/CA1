package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;
    
        @Inject
        public HomeController(FormFactory f) {
            this.formFactory = f;
        }
    
        public Result index(Long cat) {
            List<Project> projectList = null;
            List<Department> departmentList = Department.findAll();
            if (cat == 0) {
                projectList = Project.findAll();
            }
            else {
                projectList = Department.find.ref(cat).getProjects();
            }
            return ok(index.render(projectList, departmentList, User.getUserById(session().get("email"))));
        }

    public Result employee() {
        List<Employee> employeeList = Employee.findAll();
        return ok(employee.render(employeeList,User.getUserById(session().get("email"))));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProject() {
        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(addProject.render(projectForm, User.getUserById(session().get("email"))));
    }
    public Result addProjectSubmit() {
        Project newProject;
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            return badRequest(addProject.render(newProjectForm, User.getUserById(session().get("email"))));
        }
        else {
            newProject = newProjectForm.get();

            if (newProject.getId() == null) {
                newProject.save();    
                flash("success", "Product " + newProject.getName() + " was added");
                
            }
            else if (newProject.getId() != null) {
                newProject.update();
                flash("success", "Project " + newProject.getName() + " was updated");
            }
        }

        return redirect(controllers.routes.HomeController.index(0));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
    }

    public Result addEmployeeSubmit() {
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Employee newEmployee = newEmployeeForm.get();
            
            if (newEmployee.getId() == null) {
                newEmployee.save();
                flash("success", "Employee " + newEmployee.getName() + " was added");                
            }

            else {
                newEmployee.update();
                flash("success", "Employee " + newEmployee.getName() + " was updated");                
            }



            return redirect(controllers.routes.HomeController.customer());
        }
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();

        flash("success", "Project has been deleted");
        
        return redirect(routes.HomeController.index(0));
    }
    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProject(Long id) {
        Project p;
        Form<Project> projectForm;

        try {
            p = Project.find.byId(id);
            projectForm = formFactory.form(Project.class).fill(p);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addProject.render(projectForm,User.getUserById(session().get("email"))));
    }
    @Transactional
    public Result updateEmployee(Long id) {        
        Employee e;
        Form<Employee> employeeForm;

        try {
            e = Employee.find.byId(id);
            employeeForm = formFactory.form(Employee.class).fill(e);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
    }

}

