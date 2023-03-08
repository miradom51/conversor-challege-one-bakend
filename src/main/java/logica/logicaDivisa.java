/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.Divisas;
import static igu.Divisas.cboA;
import static igu.Divisas.cboDe;
import static igu.Divisas.txtCantidad;

/**
 *
 * @author cristian
 */
public class logicaDivisa {

    private double valor;
    private int divisa;
    private int dFinal;
    private double resultado;
   

    public logicaDivisa() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getdFinal() {
        return dFinal;
    }

    public void setdFinal(int dFinal) {
        this.dFinal = dFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
    
    public void datos() {
       valor = Double.parseDouble(txtCantidad.getText());
        
        divisa = cboDe.getSelectedIndex();
        dFinal = cboA.getSelectedIndex();
        
        double Final = convertir(resultado);
        
        Divisas.lResultado.setText("  $ " + Final);   
    }
    
    

    public double convertir(double resultado) {
        switch (divisa) {
            case 0 -> {
                if (divisa == 0 && dFinal == 1) {
                    resultado = valor * 0.0050;
                } else if (divisa == 0 && dFinal == 2) {
                    resultado = valor * 0.0047;
                } else if (divisa == 0 && dFinal == 3) {
                    resultado = valor * 0.0042;
                } else if (divisa == 0 && dFinal == 4) {
                    resultado = valor * 0.69;
                } else if (divisa == 0 && dFinal == 5) {
                    resultado = valor * 6.58;
                } else {
                    resultado = valor;
                }
            }
            case 1 -> {
                if (divisa == 1 && dFinal == 0) {
                    resultado = valor * 200.5;
                } else if (divisa == 1 && dFinal == 2) {
                    resultado = valor * 0.95;
                } else if (divisa == 1 && dFinal == 3) {
                    resultado = valor * 0.84;
                } else if (divisa == 1 && dFinal == 4) {
                    resultado = valor * 137.10;
                } else if (divisa == 1 && dFinal == 5) {
                    resultado = valor * 1316.35;
                } else {
                    resultado = valor;
                }
            }
            case 2 -> {
                if (divisa == 2 && dFinal == 0) {
                    resultado = valor * 210.98;
                } else if (divisa == 2 && dFinal == 1) {
                    resultado = valor * 1.05;
                } else if (divisa == 2 && dFinal == 3) {
                    resultado = valor * 0.89;
                } else if (divisa == 2 && dFinal == 4) {
                    resultado = valor * 144.64;
                } else if (divisa == 2 && dFinal == 5) {
                    resultado = valor * 1388.47;
                } else {
                    resultado = valor;
                }
            }
            case 3 -> {
                if (divisa == 3 && dFinal == 0) {
                    resultado = valor * 236.73;
                } else if (divisa == 3 && dFinal == 1) {
                    resultado = valor * 1.18;
                } else if (divisa == 03 && dFinal == 2) {
                    resultado = valor * 1.12;
                } else if (divisa == 3 && dFinal == 4) {
                    resultado = valor * 162.30;
                } else if (divisa == 3 && dFinal == 5) {
                    resultado = valor * 1557.82;
                } else {
                    resultado = valor;
                }
            }
            case 4 -> {
                if (divisa == 4 && dFinal == 0) {
                    resultado = valor * 1.46;
                } else if (divisa == 4 && dFinal == 1) {
                    resultado = valor * 0.0073;
                } else if (divisa == 4 && dFinal == 2) {
                    resultado = valor * 0.0069;
                } else if (divisa == 4 && dFinal == 3) {
                    resultado = valor * 0.0062;
                } else if (divisa == 4 && dFinal == 5) {
                    resultado = valor * 9.60;
                } else {
                    resultado = valor;
                }
            }
            case 5 -> {
                if (divisa == 5 && dFinal == 0) {
                    resultado = valor * 0.15;
                } else if (divisa == 5 && dFinal == 1) {
                    resultado = valor * 0.00076;
                } else if (divisa == 5 && dFinal == 2) {
                    resultado = valor * 0.00072;
                } else if (divisa == 5 && dFinal == 3) {
                    resultado = valor * 0.00064;
                } else if (divisa == 5 && dFinal == 4) {
                    resultado = valor * 0.10;
                } else {
                    resultado = valor;
                }
            }
        }

        return resultado;
    }

}
