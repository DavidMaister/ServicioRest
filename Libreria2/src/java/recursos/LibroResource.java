/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;



import java.util.ArrayList;
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
@Path("/libreria2")
public class LibroResource {
    
    ArrayList<Libro> libros = new ArrayList();
  
    @GET
    @Produces({MediaType.APPLICATION_XML})
    public Libro consultar(@QueryParam("posicion") int posicion){
        return libros.get(posicion);
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML})
    public String añadir(Libro nuevoLibro){
        libros.add(nuevoLibro);           
        return "Libro guardado en la posicion "+(libros.size() - 1);
    }
    
    
    @PUT
    @Consumes({MediaType.APPLICATION_XML})
    public String modificar( Libro nuevoLibro, @QueryParam("posicion") int pos){
        libros.get(pos).setAutor(nuevoLibro.getAutor());
        libros.get(pos).setTitulo(nuevoLibro.getTitulo());
        libros.get(pos).setAño(nuevoLibro.getAño());
        libros.get(pos).setEditorial(nuevoLibro.getEditorial());
        
        return "Datos modificados del libro en la posicion "+pos;
    }
    
    @DELETE
    @Produces({MediaType.APPLICATION_XML})
    public String borrar(@QueryParam("posicion") int pos){
        libros.remove(pos);
        return "Borrado el libro de la posicion "+pos;
    }
    
    
}


/*  xml ejemplo:
<?xml version="1.0" encoding="UTF-8"?> 
   <Libro> 
       <autor>Yahvé</autor> 
       <año>0</año> 
       <editorial>El arca de Noe</editorial> 
       <titulo>La Biblia</titulo> 
   </Libro>

*/
