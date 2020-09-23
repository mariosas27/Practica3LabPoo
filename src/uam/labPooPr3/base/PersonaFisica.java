/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.base;

import java.util.Date;

/**
 *
 * @author mario
 */
public class PersonaFisica {
    /**
     * 
     */
    private String nombre; 
    private Date fechaNacimiento; 
    private String direccion; 
    private String estadoCivil; 
    private String rfc; 

    /**
     * Constructor sin parametros, los atributos se tienen que asignar a través de los métodos setters
     */
    public PersonaFisica() {
    }

    /**
     * Constructor con parametros, su uso evita hacer la asignacion a través de los setters 
     * @param nombre indica el nombre de la persona física
     * @param fechaNacimiento indica la fecha de nacimiento de la persona
     * @param direccion indica la direccion de la persona
     * @param estadoCivil indica el estado civil (solter@, casad@, etc)
     * @param rfc Indica el registro federal de contribuyentes de la persona 
     */
    public PersonaFisica(String nombre, Date fechaNacimiento, String direccion, String estadoCivil, String rfc) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rfc = rfc;
    }

    /**
     * Asigna un nombre a la persona
     * @param nombre nombre de la persona a crear 
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna una fecha de naciemiento a la persona 
     * @param fechaNacimiento fecha de nacimiento de la persona 
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Asigna una direccion a la persona 
     * @param direccion direccion de la persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Asigna un estado civil a la persona en cuestion
     * @param estadoCivil estado civil de la persona 
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * Asigna el registro federal de contribuyentes a la persona
     * @param rfc registro federal de contribuyentes
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * 
     * @return String - el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return Date - fecha de naciemiento de la persona
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @return String - fecha de nacimiento de la persona 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return String - estado civil de de la persona
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     *
     * @return String - Registro Federal de contribuyentes de la persona 
     */
    public String getRfc() {
        return rfc;
    }
    
    /**
     * 
     * @return String - Estado de la persona  
     */
    @Override 
    public String toString(){
        
        return  "\nNombre: " + this.nombre +
                "\nFecha de nacimiento: " + this.fechaNacimiento +
                "\nDireccion: " + this.direccion + 
                "\nEstado Civil: " + this.estadoCivil +
                "\nRfc: " + this.rfc; 
    }
}
