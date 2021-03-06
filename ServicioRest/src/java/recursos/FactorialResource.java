/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import javax.ejb.Stateless;
import static javax.swing.text.html.FormSubmitEvent.MethodType.*;
import javax.ws.rs.*;

/**
 *
 * @author david
 */
@Stateless
@Path("/factorial")
public class FactorialResource {
    @GET
    public String factorial(@QueryParam("num1") long base){
        return Long.toString($factorial(base));
    }
    
    long $factorial(long base)  {
        if (base >= 1){
            return $factorial(base - 1) * base;
        }
        return 1;
    }
    
    @GET
    public String suma(@QueryParam("suma") long sumando){
        return Long.toString($suma(sumando));
    }
    
    long $suma(long sumando)  {
        return sumando + sumando;
    }
    
    
}
