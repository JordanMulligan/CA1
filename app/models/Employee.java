package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Employee extends Model{
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String address;


    @Constraints.Required
    private String email;

    @OneToOne
    private Department department;

    public Employee() {
    }

    public Employee(Long id, String name,String address, String em, String department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = em;
        this.department = department;
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
    
    public static final List<Employee> findAll() {
        return Employee.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment(){
        return department;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setDepartment(Department d){
        this,department = d;
    }

}

