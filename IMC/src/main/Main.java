/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelImc;
import views.ViewImc;
import controllers.ControllerImc;
/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelImc modelimc = new ModelImc();
        ViewImc viewimc = new ViewImc();
        ControllerImc controllerimc = new ControllerImc(modelimc, viewimc);
        
    }
    
}
