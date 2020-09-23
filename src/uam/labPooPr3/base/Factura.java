/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.base;

/**
 *
 * @author mario
 */
public class Factura {
    private String nombreCliente; 
    private String direccion; 
    private String rfc; 
    private Double ivaAplicado; 
    private Double totalSinIva; 
    private Double totalConIva; 
    
    public Factura() {
        
    }
   
    /**
     * Método que genera una factura para un cliente físico
     * @param cliente cliente físico que solicita la factura
     * @param venta venta sobre la cual se genera la factura
     * 
     */
    
    public void generarFactura(ClienteFisico cliente, Venta venta){
        nombreCliente = cliente.getNombre(); 
        direccion = cliente.getDireccion(); 
        rfc = cliente.getRfc(); 
        totalSinIva  = venta.getTotal(); 
      
        ivaAplicado = 0.15; 
        totalConIva = totalSinIva + (totalSinIva*ivaAplicado);
    }
    
    /**
     * Método que genera una factura para un cliente moral 
     * @param cliente cliente moral que genera automáticamente la factura al comprar
     * @param venta venta sobre la cual se genera la factura 
     * 
     */
    public void generarFactura(ClienteMoral cliente, Venta venta){
        nombreCliente = cliente.getRazonSocial(); 
        direccion = cliente.getDireccion(); 
        rfc = cliente.getRfc(); 
        totalSinIva = venta.getTotal(); 
        
        ivaAplicado = 0.20; 
        totalConIva = totalSinIva + (totalSinIva*ivaAplicado);
        
    }
    
    @Override
    public String toString(){
        return  "\nNombre del cliente: " + this.nombreCliente +
                "\nDireccion: " + this.direccion +
                "\nRFC: " + this.rfc +
                "\nIva Aplicado: " + this.ivaAplicado*100 +"%" + 
                "\nTotal sin Iva: " + this.totalSinIva + 
                "\nTotal con Iva: " + this.totalConIva; 
    }
    
}
