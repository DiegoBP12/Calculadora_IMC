/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelImc;
import views.ViewImc;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class ControllerImc implements ActionListener{
    ModelImc modelimc;
    ViewImc viewimc;
    
    public ControllerImc(ModelImc modelimc, ViewImc viewimc){
        this.modelimc = modelimc;
        this.viewimc = viewimc;
        this.viewimc.jb_calcular.addActionListener(this);
        initComponents();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewimc.jb_calcular){
            jb_calcular_action_performed();
        }
    }
    
    public void jb_calcular_action_performed(){
         try{ 
               int peso = Integer.parseInt(viewimc.jtf_peso.getText());
               modelimc.setPeso(peso);
               float altura = Float.parseFloat(viewimc.jtf_altura.getText());
               modelimc.setAltura(altura);
               modelimc.setName(viewimc.jtf_nombre.getText());
             
             if(modelimc.getAltura() >=2){
                 JOptionPane.showMessageDialog(viewimc,"El valor de la estatura no es correcto","Error",JOptionPane.ERROR_MESSAGE);
             }
             
             else if (modelimc.getPeso() <= 0){
                 JOptionPane.showMessageDialog(viewimc,"El valor del peso no es correcto","Error",JOptionPane.ERROR_MESSAGE);
             }
             
             else if(modelimc.getName().isEmpty()){
                 JOptionPane.showMessageDialog(viewimc,"Ingresa un nombre","Error",JOptionPane.ERROR_MESSAGE);
             }
             else{
                  float imc = modelimc.getPeso() / (modelimc.getAltura() * modelimc.getAltura());
                  if (imc < 18.5){
                        JOptionPane.showMessageDialog(viewimc,modelimc.getName() + " \n IMC= " + imc + "\n ¡Estas baj@ de peso!","Hey!",JOptionPane.PLAIN_MESSAGE);
                    }
                    else if (imc >= 18.5 && imc <=24.9){
                        JOptionPane.showMessageDialog(viewimc,modelimc.getName() + " \n IMC= " + imc + "\n Estas en el peso correcto!","Felicidades!",JOptionPane.PLAIN_MESSAGE);
                    }
                    else if (imc >=25 && imc<=29.9){
                        JOptionPane.showMessageDialog(viewimc,modelimc.getName() + "\n IMC=" + imc + "\n Estas pasad@ de peso!","Ups!",JOptionPane.WARNING_MESSAGE);
                    }
                    else if (imc >= 30){
                        JOptionPane.showMessageDialog(viewimc,modelimc.getName() + " \n IMC= " + imc + "\n Estas Obes@!","OH NO!",JOptionPane.WARNING_MESSAGE);
                    }
             }
         }
         catch(NumberFormatException e){
            JOptionPane.showMessageDialog(viewimc, "Ingresa un valor","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void initComponents(){
        viewimc.setVisible(true);
        
    }
    
}

