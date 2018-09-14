/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.modell.Venta;
import java.util.ArrayList;

/**
 *
 * @author CLEISER
 */
public interface VentaDAO {
     public boolean createProducto(Venta ve);
    public ArrayList<Venta> readVenta();
    public boolean updateVenta(Venta ve);
    public boolean deleteVenta(String id);
    
}
