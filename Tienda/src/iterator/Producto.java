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
public class Producto {
    
    String codigoProducto;
    String nombreComercial;
    String detalles;
    double precio;
    String estadoProducto;
    boolean garantia; 
    ArrayList<String> fallos;

    public Producto(String codigoProducto, String nombreComercial, String detalles, double precio, String estadoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreComercial = nombreComercial;
        this.detalles = detalles;
        this.precio = precio;
        this.estadoProducto = estadoProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    
    public boolean getGarantia() {
        return garantia;
    }
    
    public ArrayList<String> getFallos() {
        return fallos;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombreComercial=" + nombreComercial + ", detalles=" + detalles + ", precio=" + precio + ", estadoProducto=" + estadoProducto + '}';
    }
    
    
    
    
}
