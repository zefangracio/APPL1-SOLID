/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author zefan
 */
public class Manager extends Employee{
    
    private ArrayList<String> documents;
    
    public Manager(String name, ArrayList<String> documents) {
        super(name);
        this.documents = new ArrayList<String>(documents);
    }
            
   public Collection<String> getDocuments(){
       return documents;
   }
   public void setDocuments(ArrayList<String> documents){
       this.documents = documents;
   }
   @Override
   public String ToString(){
       return this.name + " : " + this.documents.toString();
   }
}
