/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr3.gestoras;
import uam.labPooPr3.abstractas.Dispositivo; 
import java.util.ArrayList; 
/**
 *
 * @author mario
 */
public class Catalogo {
    private ArrayList<Dispositivo> productos; 
   
    /**
     * constructor sin parámetros
     */
    public Catalogo() {
        this.productos = new ArrayList<>(); 
    }

    /**
     * constructor que toma como parámetro una lista de productos
     * @param productos lista de productos a agregar al catálogo 
     */
    public Catalogo(ArrayList<Dispositivo> productos) {
        this.productos = productos;
    }
    
    /**
     *
     * @param producto dipositivo a agregar al catálogo 
     */
    public void agregarProducto(Dispositivo producto){
        this.productos.add(producto);
    }

    /**
     *
     * @return Int - la cantidad de productos que hay en el catálogo
     */
    public int getTotalProductos(){
        return productos.size(); 
    }
    
    /**
     *
     * @return ArrayList - todos los productos que están en el catálogo 
     */
    public ArrayList<Dispositivo> getProductos(){
        return this.productos; 
    }
    
    /**
     * muestra por consola todos los productos que tiene el catálogo 
     */
    public void mostrarCatalogo(){
        System.out.println("A continuación se muestran los productos: ");
        for(Dispositivo disp : productos){
            System.out.println("------------------------------------------");
            System.out.println(disp.toString());
        }
    }
    
    /**
     *
     * @return String - el estado actual del catálogo 
     */
    @Override
   public String toString(){
      return "El catalogo cuenta con " + this.productos.size() + " productos"; 
   }
    
    
}
