/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.base;

import java.util.ArrayList;
import java.util.Date;
import uam.labPooPr3.abstractas.Dispositivo;

/**
 *
 * @author mario
 */
public class Venta {
    private String nombreCliente; 
    private String direccion; 
    private String usuario; 
    private String rfc; 
    private ArrayList<Dispositivo> productos ; 
    private Double total; 
    private Date fecha; 
    /**
     * Constructor para crear una venta, cliente de tipo físico
     * @param clienteFisico cliente de tipo físico que realiza la compra
     */
    public Venta(ClienteFisico clienteFisico){
        this.nombreCliente = clienteFisico.getNombre(); 
        this.productos = clienteFisico.getCarrito();
        this.direccion = clienteFisico.getDireccion(); 
        this.rfc = clienteFisico.getRfc(); 
        this.usuario = clienteFisico.getUsuario(); 
    }
    
    /**
     * Constructor para crear una venta, cliente de tipo moral 
     * @param clienteMoral cliente de tipo moral que realiza la compra 
     */
    public Venta(ClienteMoral clienteMoral){
        this.nombreCliente = clienteMoral.getRazonSocial(); 
        this.productos = clienteMoral.getCarrito();
        this.direccion = clienteMoral.getDireccion(); 
        this.rfc = clienteMoral.getRfc(); 
        this.usuario = clienteMoral.getUsuario(); 
    }
    
    /**
     * crea la venta de la lista de productos que se asigno previamente 
     * @return devuelve la venta generada con los datos que se colocaron del cliente
     */
    public Venta generarVenta(){
        fecha = new Date();
        total = 0.0;
        for(Dispositivo producto : productos){
            this.total += producto.getPrecio(); 
        }
        return this; 
    }

    /**
     *
     * @return el nombre del cliente que realizó la compra
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     *
     * @return la dirección del cliente que realizó la compra
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return el usuario del cliente que realizó la compra
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @return el RFC del cliente que realizó la compra
     */
    public String getRfc() {
        return rfc;
    }

    /**
     *
     * @return los productos que se vendieron
     */
    public ArrayList<Dispositivo> getProductos() {
        return productos;
    }

    /**
     *
     * @return el total de la venta 
     */
    public Double getTotal() {
        return total;
    }

    /**
     *
     * @return fecha en que se realizó la venta 
     */
    public Date getFecha() {
        return fecha;
    }
    
    
    
    
    /**
     * 
     * @return String - Estado de la venta 
     */
    @Override 
    public String toString(){
        return  "\nNombre cliente: " + this.nombreCliente +
                "\nFecha: " + this.fecha +
                "\nDireccion: " + this.direccion +
                "\nUsuario: " + this.usuario +
                "\nRFC: " + this.rfc +
                "\nTotal Productos: " + this.productos.size() +
                "\nTotal: " + this.total; 
    }
}
