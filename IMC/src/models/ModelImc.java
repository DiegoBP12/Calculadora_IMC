/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Diego
 */
public class ModelImc {
    private String name;
    private int peso;
    private float altura;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
     
}
