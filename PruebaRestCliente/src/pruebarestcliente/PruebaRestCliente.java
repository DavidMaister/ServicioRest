/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarestcliente;

/**
 *
 * @author david
 */
public class PruebaRestCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FactorialCliente client = new FactorialCliente();
        long numero = 4;
        String resultado = client.factorial(String.class, String.valueOf(numero));
        System.out.println("Resultado: "+resultado);
    }
    
}
