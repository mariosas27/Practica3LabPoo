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
public class PersonaMoral {
    private String razonSocial; 
    private String direccion; 
    private String mision; 
    private String vision; 
    private Date fechaCreacion; 
    private String rfc; 
    
    /**
     * Constructor sin parametros, el estado de los atributos debe de ser indicado con los setters
     */
    public PersonaMoral() {
    }
    
    /**
     * Constructor con parametros
     * @param razonSocial indica el nombre de la razon social o empresa
     * @param direccion inidica la direccion de la persona moral (empresa)
     * @param mision indica la mision de la persona moral (empresa)
     * @param vision indica la vision de la persona moral (empresa)
     * @param fechaCreacion indica la fecha en que fue creada la persona moral (empresa)
     * @param rfc indica el Registro Federal de Contribuyentes de la persona moral (empresa)
     */
    public PersonaMoral(String razonSocial, String direccion, String mision, String vision, Date fechaCreacion, String rfc) {
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.mision = mision;
        this.vision = vision;
        this.fechaCreacion = fechaCreacion;
        this.rfc = rfc;
    }

    /**
     * Asigna el nombre de la razon social 
     * @param razonSocial es el nombre de la razon social 
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * Asigna la direccion de la persona moral 
     * @param direccion es la direccion de la persona moral 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Asigna la mision de la persona moral 
     * @param mision es la mision de la persona moral 
     */
    public void setMision(String mision) {
        this.mision = mision;
    }

    /**
     * Asigna la vision de la persona moral 
     * @param vision es la vision de la persona moral 
     */
    public void setVision(String vision) {
        this.vision = vision;
    }

    /**
     * Asgina la fecha en que fue creada al persona moral 
     * @param fechaCreacion es la fecha de creacion de la persona moral 
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Asigna el Registro Federal de Contribuyentes de la persona moral 
     * @param rfc es el Resgistro Federal de Contribuyentes de la persona moral 
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     *
     * @return String - La razón social de la persona moral 
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     *
     * @return String - La direccion de la persona moral 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @return String - La mision de la persona moral 
     */
    public String getMision() {
        return mision;
    }

    /**
     *
     * @return String - La vision de la persona moral 
     */
    public String getVision() {
        return vision;
    }

    /**
     *
     * @return Date - La fecha de creacion de la persona
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     *
     * @return String - El Registro Federal de Contribuyentes de la persona moral
     */
    public String getRfc() {
        return rfc;
    }
    
    /**
     * 
     * @return String - Estado de la persona moral 
     */
    
    @Override
    public String toString(){
        return  "\nRazon social: " + this.razonSocial + 
                "\nDireccion: " + this.direccion + 
                "\nMision: " + this.mision + 
                "\nVision: " + this.vision + 
                "\nFecha de creacion: " + this.fechaCreacion +
                "\nRFC: " + this.rfc; 
    }
    


    
}
