/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.interfaces;

import java.util.ArrayList;
import uam.labPooPr3.abstractas.Dispositivo;
import uam.labPooPr3.base.Venta;

/**
 *
 * @author mario
 */
public interface ClienteSistema {

    /**
     * método que cada cliente tendrá que definir según sea el caso
     * @return la venta generada
     */
    public Venta generarCompra(); 

    /**
     * agrega una lista de productos a los clientes 
     * @param productos lista de productos a agregar 
     */
    public void agregarProductos(ArrayList<Dispositivo> productos); 

    /**
     * agraga un solo producto al cliente 
     * @param producto producto por agregar 
     */
    public void agregarProductos(Dispositivo producto); 

    /**
     * genera una factura según sea el tipo de cliente que implemente la interface
     * @param venta la venta sobre la que se quiere generar una factura 
     */
    public void generarFactura(Venta venta);
}
