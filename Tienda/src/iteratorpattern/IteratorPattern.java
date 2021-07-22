/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<Producto> p = new ArrayList<>();
        p.add(new Producto("xyz-983", "ps5", "consola Juegos", 950, "disponible"));
        p.add(new Producto("xyz-984", "ps6", "consola Juegos", 950, "reparacion"));
        p.add(new Producto("xyz-985", "ps7", "consola Juegos", 950, "tienda"));
        p.add(new Producto("xyz-986", "ps8", "consola Juegos", 950, "disponible"));
        p.add(new Producto("xyz-987", "ps9", "consola Juegos", 950, "disponible"));
        
        ListIterator<Producto> li =  new ProductList(p);
        Iterator<Producto> ip = li.iterator();
        
        System.out.println(ip.hasNext());
        while(ip.hasNext()){
            Producto prod = ip.next();
            if(prod.getEstadoProducto().equals("disponible"))
                System.out.println(prod);
        }
    
    }
    
}
