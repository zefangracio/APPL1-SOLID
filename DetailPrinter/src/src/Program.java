/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zefan
 */
public class Program {

    
    public static void main(String[] args) {
       
            Employee employee = new Employee("Name");
            Manager manager = new Manager("Manager name", new ArrayList<String>());
            
            ArrayList<Employee> List = new ArrayList<Employee>();
            List.add(employee);
            List.add(manager);
            
            DetailsPrinter printer = new DetailsPrinter(List);
            printer.printDetails();
    }
    
}
