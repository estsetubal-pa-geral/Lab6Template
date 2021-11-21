/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author patricia.macedo
 */
public class Relationship {
    private String description;
    private RelRole role;
    
    public enum RelRole {
    CLASS,GROUP
    }

    public Relationship(String description, RelRole role) {
        this.description = description;
        this.role=role;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return( " " + description + " ");
    }
    
     public boolean isRole(RelRole role){
           return this.role==role;
   }
}
