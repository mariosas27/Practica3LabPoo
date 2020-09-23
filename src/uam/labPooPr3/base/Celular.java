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
public class Celular extends Dispositivo{
    private String numeroImei; 
    private String compania; 

    /**
     * constructor sin parámetros, el estado de cada atributo se debe de asignar con los setters
     */
    public Celular() {
    }

    /**
     * 
     * @param marca marca del celular
     * @param modelo modelo del celular
     * @param precio precio del celular
     * @param descripcion desc del celuar
     * @param color color del celular
     * @param numeroImei numero Imei del celular
     * @param compania compania del celular 
     */
    public Celular(String marca, String modelo, Double precio, String descripcion, String color, String numeroImei, String compania) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
        this.descripcion = descripcion; 
        this.color = color; 
        this.numeroImei = numeroImei;
        this.compania = compania;
    }

    /**
     *
     * @param numeroImei numero imei del celular
     */
    public void setNumeroImei(String numeroImei) {
        this.numeroImei = numeroImei;
    }

    /**
     *
     * @param compania compania telefónica del celular
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     *
     * @return String - el numero Imei del celular
     */
    public String getNumeroImei() {
        return numeroImei;
    }

    /**
     *
     * @return String - la compania del celular 
     */
    public String getCompania() {
        return compania;
    }
    
    /**
     *
     * @param numero numero al que se desea llamar
     */
    public void llamar(String numero){
        System.out.println("LLamando al numero " + numero);
    }
    
    /**
     *
     * @param numero numero al que se desea mandar mensaje
     * @param mensaje mensaje que se mandará 
     */
    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Mandando mensaje a " + numero); 
        System.out.println("Contenido del mensaje: " + mensaje);
    }

    /**
     *
     * @return String - estado del celular 
     */
    @Override
    public String toString(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio
                + "\nDescripcion: " + this.descripcion + "\nColor: " + this.color + "\nNumero Imei: " + this.numeroImei
                + "\nCompania: " + this.compania;  
    }
    
}
