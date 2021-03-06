/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */

@XmlRootElement(name="Libro")
public class Libro {
    private String titulo;
    private String autor;
    private int año;
    private String editorial;
    
    public Libro(){
        titulo="La Biblia";
        autor="Yahvé";
        año = 0;
        editorial = "El arca de Noe";
    }
    
    public Libro(String titulo_, String autor_, int año_, String editorial_){
        titulo=titulo_;
        autor=autor_;
        año = año_;
        editorial = editorial_;
    }
    
    public void borrar(){
        titulo = null;
        autor = null;
        año = -1;
        editorial = null;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
   
    public String getAutor(){
        return autor;
    }
    
    
    public String getEditorial(){
        return editorial;
    }
    
    
    
    public int getAño(){
        return año;
    }
    
    @XmlElement(name="titulo")
    public void setTitulo(String titulo_){
        titulo = titulo_;
    }
    
    @XmlElement(name="autor")
    public void setAutor(String autor_){
        autor = autor_;
    }
    
    @XmlElement(name="editorial")
    public void setEditorial(String editorial_){
        editorial = editorial_;
    }
    
    @XmlElement(name="año")
    public void setAño(int año_){
        año = año_;
    }
    
    
    public String toString(){
        String cadena;
        return cadena = "Titulo: "+titulo+"\n Autor: "+ autor+"\n Año: "+año+"\n Editorial: "+editorial;
    }
    
    
    
}
