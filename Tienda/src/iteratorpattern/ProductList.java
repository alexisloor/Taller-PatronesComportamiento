/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class ProductList implements ListIterator<Producto> {
    
    private ArrayList<Producto> listaProductos;

    public ProductList(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    

    @Override
    public Iterator<Producto> iterator() {
        return new ProductIterator(listaProductos);
    }
    
    
    
    
}
