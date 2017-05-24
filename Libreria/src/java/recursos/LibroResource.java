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
@Path("/libreria")
public class LibroResource {
    
    Libro libro;
    
    @POST
    public String factorial(@QueryParam("titulo") String titulo,@QueryParam("autor") String autor, 
            @QueryParam("año") int año, @QueryParam("editorial") String editorial){
        libro = new Libro(titulo, autor, año, editorial);
        return "Datos guardados";
    }
    
    
}
