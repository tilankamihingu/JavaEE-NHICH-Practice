/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Click
 */
@Named(value = "bmiController")
@SessionScoped
public class BmiController implements Serializable {

    /**
     * Creates a new instance of BmiController
     */
    private Double height;
    private Double weight;
    private Double bmi;
    public BmiController() {
    }
    
    public void calculateBmi(){
        bmi = weight / (height*height );
    }
    
    public void clearValues(){
        height=null;
        weight=null;
        bmi=null;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }
    
    
}
