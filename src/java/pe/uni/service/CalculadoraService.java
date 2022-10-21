/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.service;

/**
 *
 * @author montespierreg
 */
public class CalculadoraService {
    public static String operacion = "";
    public static double calculandoOperac(double n1, double n2, String operacion){
    
        
        double resultado=0;
        
        if(operacion.equals("suma")){
            resultado = n1 + n2;
        } else if(operacion.equals("resta")){
            resultado = n1 - n2;
        } else if(operacion.equals("multiplicacion")){
            resultado = n1 * n2;
        } else if(operacion.equals("division")){
            resultado = n1 / n2;
        }else{
            resultado = n1*-400000;
        }
           
        return resultado;
    }
    
}
