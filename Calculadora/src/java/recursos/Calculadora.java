/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author david
 */
    
@Stateless
@Path("/calculadora")
public class Calculadora {
    /**
     *
     * @param base
     * @param base
     * @return
     */
    @GET
    public String calculadora(@QueryParam("opt") String operacion, @QueryParam("num1") long num1, @QueryParam("num2") long num2){
        String resultado = "null";
        switch(operacion){
            case "suma":
                resultado = Long.toString(suma(num1, num2));
            break;
                
            case "resta":
                resultado = Long.toString(resta(num1, num2));
            break;
            
            case "mult":
                resultado = Long.toString(mult(num1, num2));
            break;
            
            case "div":
                resultado = Long.toString(div(num1, num2));
            break;
        }
        return resultado;
    }
    
    long suma(long num1, long num2)  {
        return num1 + num2;
    }
    
    long resta(long num1, long num2)  {
        return num1 - num2;
    }
    
    long mult(long num1, long num2)  {
        return num1 *num2;
    }
    
    long div(long num1, long num2)  {
        if(num2 != 0){
            return num1/num2;
        }
        else
            return 0;
    }
}   
