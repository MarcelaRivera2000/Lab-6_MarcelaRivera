/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_marcelarivera;

/**
 *
 * @author Mvrivera
 */
public class Personas {
    private String nombre,usuario,contra,cumple;
    private int edad;

    public Personas() {
    }

    public Personas(String nombre, String usuario, String contra, String cumple, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
        this.cumple = cumple;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
    
}
