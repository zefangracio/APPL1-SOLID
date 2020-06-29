/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import static java.lang.System.in;
import java.util.List;

/**
 *
 * @author zefan
 */
public class DetailsPrinter {
    
    private List<Employee> employees;

        public DetailsPrinter(List<Employee> employees)
        {
            this.employees = employees;
        }

        public void printDetails()
        {
            for (Employee employee : employees)
            {
               System.out.println(employee);
            }
        }
}
