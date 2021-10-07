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
    NONE(0), DEVELOPMENTS(1), ACCCOUNTING(2), SALES(3);

    private final int department_code;
    Departments(int ord){
        this.department_code = ord;
    }
    
    public int getDepartmentCode(){
        return this.department_code;
    } 

    public static Departments getNONE() {
        return NONE;
    }

    public static Departments getDEVELOPMENTS() {
        return DEVELOPMENTS;
    }

    public static Departments getACCCOUNTING() {
        return ACCCOUNTING;
    }

    public static Departments getSALES() {
        return SALES;
    }
    
    
    public String toString(){
        return this.name();
    }
}
