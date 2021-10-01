/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailgenerator;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author omid
 */
public class Employee {

    String first_name;
    String last_name;
    LocalDate dob;
    Departments department;

    public Employee(String first_name, String last_name, LocalDate dob, Departments departments) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.department = departments;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Departments getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        if (department.name().toString().equals("none")) {
            return first_name + " " + last_name + " and has been born at " + dob + ". Who works at "+department.name().toUpperCase()+" of the defined departments";

        }
        return first_name + " " + last_name + " and has been born at " + dob + ". Who works at " + department.name();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Employee new_employee = (Employee) obj;

        return (new_employee.getFirst_name().equalsIgnoreCase(this.getFirst_name()) && new_employee.getLast_name().equalsIgnoreCase(this.getLast_name()) && (new_employee.getDepartment().ordinal() == this.getDepartment().ordinal()));

    }

}
