/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.base;
import java.util.Date;
import uam.labPooPr3.abstractas.Dispositivo; 


/**
 *
 * @author mario
 */
public class Wearable extends Dispositivo{
    private String numeroSerie; 
    private String tipoInterfazCarga; 
    private String tipoMaterial; 
    private Date horaFecha; 
    
    /**
     * constructor sin parámetros, el estado de los atributos se debe de asignar con los setters
     */
    public Wearable() {
    }

    /**
     *
     * @param marca marca del wearable
     * @param modelo modelo del wearable
     * @param precio precio del wearable
     * @param descripcion desc del wearable
     * @param color color del wearable
     * @param numeroSerie numero de serie del wearable
     * @param tipoInterfazCarga tipo de interfaz de carga del wearable
     * @param tipoMaterial tipo de material del wearable
     */
    public Wearable(String marca, String modelo, Double precio, String descripcion, String color,String numeroSerie, String tipoInterfazCarga, String tipoMaterial) {
        horaFecha = new Date(); 
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
        this.descripcion = descripcion; 
        this.color = color; 
        this.numeroSerie = numeroSerie;
        this.tipoInterfazCarga = tipoInterfazCarga;
        this.tipoMaterial = tipoMaterial;
    }

    /**
     *
     * @param numeroSerie numero de seride del wearable
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     *
     * @param tipoInterfazCarga tipo de interfaz de carga del wearable
     */
    public void setTipoInterfazCarga(String tipoInterfazCarga) {
        this.tipoInterfazCarga = tipoInterfazCarga;
    }

    /**
     *
     * @param tipoMaterial tipo de material del wearable
     */
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    /**
     *
     * @return String - numero de serie del wearable
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     *
     * @return String - tipo de interfaz de carga del wearable
     */
    public String getTipoInterfazCarga() {
        return tipoInterfazCarga;
    }

    /**
     *
     * @return String - tipo de material del wearable
     */
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    /**
     *
     * @return Date - fecha y hora que marca el wearable
     */
    public Date getHoraFecha() {
        return horaFecha;
    }
    
    /**
     *
     * @return String - estado del wearable
     */
    @Override
    public String toString(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio
                + "\nDescripcion: " + this.descripcion + "\nColor: " + this.color + "\nNumero de serie: " + this.numeroSerie
                + "\nTipo de material " + this.tipoMaterial + "\nTipo de interfaz de carga: " + this.tipoInterfazCarga; 
    }
    
}
