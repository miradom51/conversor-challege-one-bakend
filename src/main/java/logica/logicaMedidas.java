/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


import igu.Medidas;

/**
 *
 * @author cristian
 */
public class logicaMedidas {
    
    private int medidaD;   
    private int medidaA;
    private double valor;
    private double resultado;
    

    public logicaMedidas() {
    }

    public int getMedidaD() {
        return medidaD;
    }

    public void setMedidaD(int medidaD) {
        this.medidaD = medidaD;
    }

    public int getMedidaA() {
        return medidaA;
    }

    public void setMedidaA(int medidaA) {
        this.medidaA = medidaA;
    }

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
    
    
    
    public void medidas(){
    
        valor = Double.parseDouble(Medidas.txtMedida.getText());
        
        medidaD = Medidas.cboDe1.getSelectedIndex();
        medidaA = Medidas.cboA1.getSelectedIndex();
        
        double mFinal = convertir(resultado);
        Medidas.lResultado.setText("" + mFinal);
    
    }
    
    
    
    public double convertir(double resultado) {
    
    switch(medidaD) {
        case 0 -> { 
            if(medidaD==0 && medidaA==1){
                resultado = valor /100;
            }else if(medidaD==0 && medidaA==2){
                resultado = valor /100000;
            }else if(medidaD==0 && medidaA==3){
                resultado = valor /160900;
            }else if(medidaD==0 && medidaA==4){
                resultado = valor /91.44;
            }else if(medidaD==0 && medidaA==5){
                resultado = valor /30.48;
            }else if(medidaD==0 && medidaA==6){
                resultado = valor /185200;
            }else {
                resultado = valor;
            }                                                        
       }
          case 1 -> { 
            if(medidaD==1 && medidaA==0){
                resultado = valor*100;
            }else if(medidaD==1 && medidaA==2){
                resultado = valor/100;
            }else if(medidaD==1 && medidaA==3){
                resultado = valor /1609;
            }else if(medidaD==1 && medidaA==4){
                resultado = valor *1.094;
            }else if(medidaD==1 && medidaA==5){
                resultado = valor* 3.281;
            }else if(medidaD==1 && medidaA==6){
                resultado = valor/1852;
            }else {
                resultado = valor;
            }                 
          }
          case 2 -> { 
            if(medidaD==2 && medidaA==0){
                resultado = valor*100000;
            }else if(medidaD==2 && medidaA==1){
                resultado = valor *1000;
            }else if(medidaD==2 && medidaA==3){
                resultado = valor /1.609;
            }else if(medidaD==2 && medidaA==4){
                resultado = valor *1094;
            }else if(medidaD==2 && medidaA==5){
                resultado = valor *3281;
            }else if(medidaD==2 && medidaA==6){
                resultado = valor/ 1.852;
            }else {
                resultado = valor;
            }               
          }
          case 3 -> { 
            if(medidaD==3 && medidaA==0){
                resultado = valor*160900;
            }else if(medidaD==3 && medidaA==1){
                resultado = valor*1609;
            }else if(medidaD==3 && medidaA==2){
                resultado = valor*1.609;
            }else if(medidaD==3 && medidaA==4){
                resultado = valor*1760;
            }else if(medidaD==3 && medidaA==5){
                resultado = valor*5280;
            }else if(medidaD==3 && medidaA==6){
                resultado = valor/1.151;
            }else {
                resultado = valor;
            }               
          }
          case 4 -> { 
            if(medidaD==4 && medidaA==0){
                resultado = valor*91.44;
            }else if(medidaD==4 && medidaA==1){
                resultado = valor/1.094;
            }else if(medidaD==4 && medidaA==2){
                resultado = valor/1094;
            }else if(medidaD==4 && medidaA==3){
                resultado = valor/1760;
            }else if(medidaD==4 && medidaA==5){
                resultado = valor*3;
            }else if(medidaD==4 && medidaA==6){
                resultado = valor/2025;
            }else {
                resultado = valor;
            }               
          }
          case 5 -> { 
            if(medidaD==5 && medidaA==0){
                resultado = valor*30.48;
            }else if(medidaD==5 && medidaA==1){
                resultado = valor/3.281;
            }else if(medidaD==5 && medidaA==2){
                resultado = valor/3281;
            }else if(medidaD==5 && medidaA==3){
                resultado = valor/5280;
            }else if(medidaD==5 && medidaA==4){
                resultado = valor/3;
            }else if(medidaD==5 && medidaA==6){
                resultado = valor/6076;
            }else {
                resultado = valor;
            }               
          }
          case 6 -> { 
            if(medidaD==6 && medidaA==0){
                resultado = valor*185200;
            }else if(medidaD==6 && medidaA==1){
                resultado = valor*1852;
            }else if(medidaD==6 && medidaA==2){
                resultado = valor*1.852;
            }else if(medidaD==6 && medidaA==3){
                resultado = valor*1.151;
            }else if(medidaD==6 && medidaA==4){
                resultado = valor*2025;
            }else if(medidaD==6 && medidaA==5){
                resultado = valor*6076;
            }else {
                resultado = valor;
            }               
          }        
    }    
    return resultado;
    }
    
}
