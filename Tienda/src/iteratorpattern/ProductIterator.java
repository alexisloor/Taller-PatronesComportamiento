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
public class ProductIterator implements Iterator<Producto>{
    
    private ArrayList<Producto> listaProductos;
    private int posicion;

    public ProductIterator(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
        this.posicion = 0;
    }
    

    @Override
    public void reset() {
        posicion = 0;
    }

    @Override
    public Producto next() {
        return listaProductos.get(posicion++);
    }

    @Override
    public Producto currentItem() {
        return listaProductos.get(posicion);
    }

    @Override
    public boolean hasNext() {
        return posicion < listaProductos.size();
    }
    
    
    
    
    
    
}
