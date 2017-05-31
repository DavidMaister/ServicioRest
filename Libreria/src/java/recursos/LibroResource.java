/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;



import javax.ejb.Stateless;
import static javax.swing.text.html.FormSubmitEvent.MethodType.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author david
 */

@Stateless
@Path("/libreria")
public class LibroResource {
    
    Libro libro;
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Libro consultar(){
        return libro;
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public String añadir(Libro nuevoLibro){
        libro = nuevoLibro;
                    
        return "Datos guardados";
    }
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public String modificar(Libro nuevoLibro){
        libro = nuevoLibro;
                    
        return "Datos modificados";
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_XML)
    public String borrar(){
        libro = null;
        return "Borrado";
    }
    
    
}
