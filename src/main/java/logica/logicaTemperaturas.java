/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.Temperaturas;
import java.math.BigDecimal;
import java.text.DecimalFormat;


/**
 *
 * @author cristian
 */
public class logicaTemperaturas {
    
    private double valor;
    private double resultado;    
    private int tempOrg;
    private int tempCam;
   
   

    //constructor
    public logicaTemperaturas() {
    }

    
    //geters and seters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getTempOrg() {
        return tempOrg;
    }

    public void setTempOrg(int tempOrg) {
        this.tempOrg = tempOrg;
    }

    public int getTempCam() {
        return tempCam;
    }

    public void setTempCam(int tempCam) {
        this.tempCam = tempCam;
    }
    
    
   // metodos
    
    public void temperaturas(){
        valor = Double.parseDouble(Temperaturas.txtTemperatura.getText());
       tempOrg = Temperaturas.cboOrigen.getSelectedIndex();
       tempCam = Temperaturas.cboCambio.getSelectedIndex();
     
      
        Temperaturas.lCelsius.setText("  " + (double)Math.round(celsius()*10000/10000));
        
    
    }
    
   public double celsius(){
        switch (tempOrg) {
            case 0->{
            if(tempOrg==0 && tempCam==1){
                resultado = valor*9/5+32;
            }else if(tempOrg==0 && tempCam==2){
                resultado = valor+273.15;
            }else {
                resultado = valor;
            }
            }     
            case 1->{
            if(tempOrg==1 && tempCam==0){
                resultado = (valor-32)*5/9;
            }else if(tempOrg==1 && tempCam==2){
                resultado = (valor-32)*5/9+273.15;
            }else {
                resultado = valor;
            }
            }           
            case 2->{
            if(tempOrg==2 && tempCam==0){
                resultado = valor-273.15;
            }else if(tempOrg==2 && tempCam==1){
                resultado = (valor-273.15)*9/5+32;
            }else {
                resultado = valor;
            }
            }           
        }
         return resultado;
   }  
   
   
 
             
       
}   
  

