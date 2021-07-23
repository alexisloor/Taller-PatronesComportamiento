/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Erwing
 * @param <E>
 */
public interface TransportSrategy {
    
    boolean loadProducts(ArrayList<Producto> products);
    void    sendProducts(String destiny);
}
    

