/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import entity.Gender;
import entity.Likert;
import entity.Place;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author pdhssp
 */
@Named(value = "enumController")
@ApplicationScoped
public class EnumController {

    /**
     * Creates a new instance of EnumController
     */
    public EnumController() {
    }
    
    public Likert[] getLikerts(){
        return Likert.values();
    }
    
    public Gender[] getGenders(){
        return Gender.values();
    }
    
    
    public Place[] getPlaces(){
        return Place.values();
    }
    
    
    
}
