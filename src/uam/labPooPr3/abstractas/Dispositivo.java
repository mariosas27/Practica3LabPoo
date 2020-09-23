/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.abstractas;

/**
 *
 * @author mario
 */
public abstract class Dispositivo {

    /**
     * indica la marca del dispositivo
     */
    protected String marca; 

    /**
     * indica el modelo del dispositivo
     */
    protected String modelo; 

    /**
     * indica el precio del dispositivo
     */
    protected Double precio; 

    /**
     * indica el precio del dispositivo
     */
    protected String descripcion; 

    /**
     * indica el color del dispositivo
     */
    protected String color;

    /**
     *
     * @param marca marca del dispositivo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @param modelo modelo del dispositivo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @param precio precio del dispositivo
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     *
     * @param descripcion descripcion del dispositivo
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param color color del dispositivo
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return String - la marca del dispositivo
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return String - el modelo del dispositivo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @return Double - el precio del dispositivo
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     *
     * @return String - la descripción del dispositivo 
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @return String - el color del dispositivo 
     */
    public String getColor() {
        return color;
    }
    
    /**
     *
     */
    public void cargar(){
        
    }
   
    
}
