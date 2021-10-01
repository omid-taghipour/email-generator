/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailgenerator;

/**
 *
 * @author omid
 */
public enum Departments {
    sales(0), developments(1), accounting(2), none(3);

    private final int department_code;
    Departments(int ord){
        this.department_code = ord;
    }
    
    public int getDepartmentCode(){
        return this.department_code;
    }
}
