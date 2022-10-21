/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.prueba.prueba;

import pe.uni.service.CalculadoraService;

/**
 *
 * @author montespierreg
 */
public class Prueba01 {
    public static void main(String[] args) {
        
        //var
        double resultado;
        
        //entrada
        double n1 = 2;
        double n2 = 5;
        String operacion = "resta";
        
        //proceso
        CalculadoraService servicio = new CalculadoraService();
        resultado = servicio.calculandoOperac(n1, n2, operacion);
        
        //salida
        System.out.println(resultado);
        
        
    }
}
