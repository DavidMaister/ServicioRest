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
        editorial = "El araca de Noe";
    }
    
    public Libro(String titulo_, String autor_, int año_, String editorial_){
        titulo=titulo_;
        autor=autor_;
        año = año_;
        editorial = editorial_;
    }
    
    @XmlElement(name="titulo")
    public String getTitulo(){
        return titulo;
    }
    
    @XmlElement(name="autor")
    public String getAutor(){
        return autor;
    }
    
    @XmlElement(name="editorial")
    public String getEditorial(){
        return editorial;
    }
    
    
    @XmlElement(name="año")
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
    
    
    
    
    
    
}
