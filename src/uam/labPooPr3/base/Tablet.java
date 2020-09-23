/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.base;
import uam.labPooPr3.abstractas.Dispositivo; 

/**
 *
 * @author mario
 */
public class Tablet extends Dispositivo {
    private String numeroSerie; 
    private String tipoInterfazCarga; 
    private String compania; 

    /**
     * constructor sin parámetros, el estado de los atributos se debe de asignar con los setters
     */
    public Tablet() {
    }

    /**
     *
     * @param marca marca de la tablet
     * @param modelo modelo de la tablet
     * @param precio precio de la tablet 
     * @param descripcion desc de la tablet
     * @param color color de la tablet
     * @param numeroSerie numero de serie de la tablet 
     * @param tipoInterfazCarga tipo de interfaz de carga de la tablet
     * @param compania compania telefónica de la tablet 
     */
    public Tablet(String marca, String modelo, Double precio, String descripcion, String color, String numeroSerie, String tipoInterfazCarga, String compania) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
        this.descripcion = descripcion; 
        this.color = color; 
        this.numeroSerie = numeroSerie;
        this.tipoInterfazCarga = tipoInterfazCarga;
        this.compania = compania;
    }

    /**
     *
     * @param numeroSerie numero de serie de la tablet 
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     *
     * @param tipoInterfazCarga tipo de interfaz de carga de la tablet
     */
    public void setTipoInterfazCarga(String tipoInterfazCarga) {
        this.tipoInterfazCarga = tipoInterfazCarga;
    }

    /**
     *
     * @param compania compania telefónica de la tablet
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     *
     * @return String - numero de serie de la tablet
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     *
     * @return String - tipo de interfaz de carga de la tablet
     */
    public String getTipoInterfazCarga() {
        return tipoInterfazCarga;
    }

    /**
     *
     * @return String - compania telefónica de la tablet
     */
    public String getCompania() {
        return compania;
    }
    
    /**
     *
     * @return String - estado de la tablet 
     */
    @Override 
    public String toString(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio
                + "\nDescripcion: " + this.descripcion + "\nColor: " + this.color + "\nNumero de serie: " + this.numeroSerie
                + "\nCompania: " + this.compania + "\nTipo de interfaz de carga: " + this.tipoInterfazCarga; 
    }
    
    
}
