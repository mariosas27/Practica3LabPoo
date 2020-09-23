/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.gestoras;
import uam.labPooPr3.base.Venta; 
import java.util.ArrayList; 
/**
 *
 * @author mario
 */
public class Tienda {
    private Catalogo catalogo; 
    private ArrayList<Venta> registroVentas; 

    /**
     * constructor sin parámetros
     */
    public Tienda() {
        registroVentas = new ArrayList<>(); 
    }

    /**
     *  Constructor que tiene como parámetro un catálgo que será asignado a la tienda 
     * @param catalogo catálogo de productos
     */
    public Tienda(Catalogo catalogo) {
        registroVentas = new ArrayList<>(); 
        this.catalogo = catalogo;
    }

    /**
     *
     * @param catalogo asigna el catálogo a la tienda
     */
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    
    /**
     * muestra el catálogo que tiene la tienda
     */
    public void mostrarCatalogo(){
        catalogo.mostrarCatalogo();
        
    }
    
    /**
     * crea una venta
     * @param venta venta que se generará 
     */
    public void crearVenta(Venta venta){
        registroVentas.add(venta); 
    }
    
    /**
     * muestra todas las ventas que tiene la tienda
     */
    public void  mostrarVentas(){
        System.out.println("Ventas: ");
        System.out.println("-----------------------------------------");
        for(Venta venta : registroVentas){
            System.out.println(venta.toString());
        }
    }
    
    /**
     *
     * @return String - estado actual de la tienda 
     */
    @Override
    public String toString(){
        return "\nLa tienda tiene un catalogo que cuenta con un total de " + this.catalogo.getTotalProductos() + " productos\ny un total de " + this.registroVentas.size() + " ventas"; 
    }
}
