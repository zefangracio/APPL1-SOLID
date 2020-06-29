/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author zefan
 */
public class Employee {
    String name;
     public Employee(String name)
        {
            this.name = name;
        }
        public String ToString()
        {
            return this.name;
        }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
