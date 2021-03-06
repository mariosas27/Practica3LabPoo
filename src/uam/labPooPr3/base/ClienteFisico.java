/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.base;

import java.util.ArrayList;
import java.util.Date;
import uam.labPooPr3.abstractas.Dispositivo;
import uam.labPooPr3.interfaces.ClienteSistema;

/**
 *
 * @author mario
 */
public class ClienteFisico extends PersonaFisica implements ClienteSistema{
    private ArrayList<Dispositivo> carrito; 
    private String usuario; 
    private String password; 
    
    /**
     * Constructor sin parámetros, tanto los atrubutos que se heredan y los propios se les asigna un estado con los settes
     */
    public ClienteFisico() {
    }

    
    /**
     * 
     * @param carrito los productos que comprará el cliente
     * @param usuario el usuario que tiene el cliente en el sistema
     * @param password la constraseña del cliente en el sistema
     * @param nombre nombre del cliente (persona física)
     * @param fechaNacimiento fecha de nacimiento del cliente (persona física)
     * @param direccion direccion del cliente (persona física)
     * @param estadoCivil estado civil del cliente (persona física)
     * @param rfc rfc del cliente (persona física)
     */
    public ClienteFisico(ArrayList<Dispositivo> carrito, String usuario, String password, String nombre, Date fechaNacimiento, String direccion, String estadoCivil, String rfc) {
        super(nombre, fechaNacimiento, direccion, estadoCivil, rfc);
        this.carrito = carrito;
        this.usuario = usuario;
        this.password = password;
    }

    /**
     * asigna los productos a comprar 
     * @param carrito productos a comprar
     */
    public void setCarrito(ArrayList<Dispositivo> carrito) {
        this.carrito = carrito;
    }

    /**
     * asigna el usuario del cliente en el sistema
     * @param usuario es el usuario del cliente en el sistema
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Asigna la contraseña al cliente 
     * @param password contraseña con la que el cliente entra al sistema 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return ArrayList - Productos a comprar 
     */
    public ArrayList<Dispositivo> getCarrito() {
        return carrito;
    }

    /**
     *
     * @return String - Usuario del cliente en el sistema
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     * @return String - contraseña del cliente en el sistema
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * 
     * @return Stting - Estado del cliente físico  
     */
    
     @Override
    public Venta generarCompra() {
        //creamos una venta
        Venta venta = new Venta(this);
        
        return venta.generarVenta(); 
    }

   
    @Override
    public void agregarProductos(ArrayList<Dispositivo> productos) {
        carrito.addAll(productos); 
    }

    @Override
    public void agregarProductos(Dispositivo producto) {
        carrito.add(producto); 
    }
    @Override
    public void generarFactura(Venta venta) {
        System.out.println("-------------- FACTURA CLIENTE FÍSICO ---------------");
        Factura factura = new Factura(); 
        
        factura.generarFactura(this, venta); 
        
        System.out.println(factura.toString());
        
    }
    
    @Override 
    public String toString(){
        return  super.toString() + 
                "\nUsuario: " + this.usuario + 
                "\nContraseña: " + this.password +
                "\nTotal productos: " + this.carrito.size(); 
    }

   

   
    
}
