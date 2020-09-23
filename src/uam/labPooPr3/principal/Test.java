/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.principal;

import java.util.ArrayList;
import java.util.Date;
import uam.labPooPr3.abstractas.Dispositivo;
import uam.labPooPr3.base.Celular;
import uam.labPooPr3.base.ClienteFisico;
import uam.labPooPr3.base.ClienteMoral;
import uam.labPooPr3.base.Tablet;
import uam.labPooPr3.base.Venta;
import uam.labPooPr3.base.Wearable;
import uam.labPooPr3.gestoras.Catalogo;
import uam.labPooPr3.gestoras.Tienda;
/**
 *
 * @author mario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------------------------------------------------------------
        //----------------------------------------- FUNCIONAMIENTO DE LA CLASE TEST -------------------------------------------------------------------
        /*  Se generan 6 dipositivos, 2 celulares, 2 tablets y 2 wearables, la creación de esto se ha reautlizado de la práctica 1, a partir de la línea
            96 se crean 4 clientes, 2 físicos y 2 morales, en cada sección se describe su creación y asignación de productos, así como la generación de 
            las ventas. 
        */
        
        // Genermaos un celular con el primer constructor
        Celular celular1 = new Celular(); 
        celular1.setMarca("Huawei");
        celular1.setModelo("P30");
        celular1.setPrecio(12000.0);
        celular1.setDescripcion("Celular huawei con 4gb de ram y 128 gb de almacenamiento interno");
        celular1.setColor("Negro");
        celular1.setNumeroImei("2111920da23");
        celular1.setCompania("AT&T");
        
        // Generamos un celular con el segundo constructor 
        Celular celular2 = new Celular("Apple", "IPhone 11", 18000.0, "IPhone 11 de 3gb de ram con 128 gb de almacenamiento interno ", "Blanco", "21l2a920da23", "Telcel"); 
        
        
        
        // Generamos una tablet con el primer constructor 
        Tablet tablet1 = new Tablet(); 
        tablet1.setMarca("Apple");
        tablet1.setModelo("IPad Pro");
        tablet1.setDescripcion("IPad Pro color Gris de 128gb de almacenamiento interno");
        tablet1.setColor("Gris");
        tablet1.setCompania("AT&T");
        tablet1.setNumeroSerie("21288839836");
        tablet1.setTipoInterfazCarga("Lightning");
        tablet1.setPrecio(20999.0); 
        
        // Generamos una tablet con el segundo consstructor 
        Tablet tablet2 = new Tablet("Apple", "IPad air", 12199.0, "IPad air de 64gb color plateado", "plateado", "3389794610", "Lightning", "Telcel"); 

        
        // Generamos un wearable con el primer constructor 
        Wearable wearable1 = new Wearable(); 
        wearable1.setMarca("Apple");
        wearable1.setModelo("Watch series 5");
        wearable1.setColor("Oro");
        wearable1.setDescripcion("Watch series 5 con pantalla de retina");
        wearable1.setPrecio(9999.0);
        wearable1.setNumeroSerie("88879523155");
        wearable1.setTipoInterfazCarga("Lightning");
        wearable1.setTipoMaterial("Aluminio");
               
        // Generamos un wearable con el segundo constructor 
        Wearable wearable2 = new Wearable("Samsung", "Galaxy Watch Active2", 8999.0, "Galaxy Watch Active 2 (40mm) color oro", "oro", "5596133001", "inalambrica", "Aluminio"); 

        
        //creamos un primer catalogo, el cual contendra un celular, un reloj y una tablet 
        Catalogo catalogo1 = new Catalogo(); 
        catalogo1.agregarProducto(celular1);
        catalogo1.agregarProducto(celular2);
        catalogo1.agregarProducto(tablet1);
        catalogo1.agregarProducto(tablet2);
        catalogo1.agregarProducto(wearable1);
        catalogo1.agregarProducto(wearable2);
        
        
        //Ahora creamos una tienda 
        Tienda tienda = new Tienda();
        //le asignamos un catalogo a esta tienda de prueba
        tienda.setCatalogo(catalogo1);
        
        //--------------------------------------------------------------------------------------------------------------------------------
        //----------------------------------------------------- Creamos algunos clientes físicos -----------------------------------------
        
        //Al primer Cliente físico le agregamos que compre todo el catálogo
        Date d = new Date(); 
        ClienteFisico clienteFisico1 = new ClienteFisico(catalogo1.getProductos(), "mariosas", "mariosas", "Juan Mario", d, "isidro duran", "soltero", "SACJ000131HTLSHNA7"); 
        
        
        //para el segundo cliente creamos una lista de productos
        ArrayList<Dispositivo> productos1 = new ArrayList<>(); 
        productos1.add(tablet2); 
        productos1.add(celular1);
        //creamos el segundo cliente fisico y le asginamos la lista de productos generada anteriormente
        ClienteFisico clienteFisico2 = new ClienteFisico(productos1, "mariosas", "mariosas", "Juan Mario", d, "isidro duran", "soltero", "SACJ000131HTLSHNA7"); 
        //ahora a este cliente le agregamos un producto más 
        
        clienteFisico2.agregarProductos(wearable1);
        
        
        
        //---------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------- creamos algunos clientes morales ---------------------------------------------
        
        ClienteMoral clienteMoral1 = new ClienteMoral(catalogo1.getProductos(), "Halco", "halco93", "HALCO", "La paz 88", "las mejores instalaciones electricas", "Calidad y servicio", d, "HALCO93@KDKOD");
        
        
        //para el segundo cliente moral creamos una lista de productos
        ArrayList<Dispositivo> productos2 = new ArrayList<>(); 
        productos2.add(celular2); 
        productos2.add(wearable1);
        
        //creamos el segundo cliente moral         
        ClienteMoral clienteMoral2 = new ClienteMoral(productos2, "laestrella", "laestrella", "Imprenta La Estrella", "Independencia 17", "Ofrecer lo mejores precios", "tu mejor opción", d, "LAESTRELLA189566R"); 

        //cremos otra lista de productos 
        
        ArrayList<Dispositivo> productos3 = new ArrayList<>(); 
        productos3.add(celular1); 
        productos3.add(tablet1);
        
        //agregamos esta nueva lista al carrito del cliente 
        clienteMoral2.agregarProductos(productos3);
        
        //---------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------ GENERAMOS LAS VENTAS -----------------------------------------------------------
        
        
        // ********************************* la venta del cliente físico 1 ***************************
        Venta venta1 = clienteFisico1.generarCompra();
        //agregamos al registro de venta 
        tienda.crearVenta(venta1);
        //mostramos la venta
        System.out.println("------------------------------ VENTA CLIENTE FÍSICO ---------------------------");
        System.out.println(venta1.toString());
        //genreamos la factura de la venta1
        clienteFisico1.generarFactura(venta1);
        
        // ********************************* la venta del cliente físico 2 ***************************
        Venta venta2 = clienteFisico2.generarCompra();
        //agregamos al registro de venta 
        tienda.crearVenta(venta2);
        //mostramos la venta
        System.out.println("------------------------------ VENTA CLIENTE FÍSICO ---------------------------");
        System.out.println(venta2.toString());
        //aquí no genreamos factura de la venta2
        
        
        // ********************************* la venta del cliente moral 1 ***************************
        Venta venta3 = clienteMoral1.generarCompra();
        //agregamos al registro de venta 
        tienda.crearVenta(venta3);
        //mostramos la venta
        System.out.println("------------------------------ VENTA CLIENTE MORAL ---------------------------");
        System.out.println(venta3.toString());
        //la factura se genera en automático 
        
        
        
         // ********************************* la venta del cliente moral 2 ***************************
        Venta venta4 = clienteMoral2.generarCompra();
        //agregamos al registro de venta 
        tienda.crearVenta(venta2);
        //mostramos la venta
        System.out.println("------------------------------ VENTA CLIENTE MORAL ---------------------------");
        System.out.println(venta4.toString());
        //la factura se genera en automático 
        
        tienda.mostrarVentas();
    
    }
    
}
