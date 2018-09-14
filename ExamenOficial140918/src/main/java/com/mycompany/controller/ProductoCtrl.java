/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.controllerimp.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.modell.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author CLEISER
 */
@ManagedBean(name = "productoCtrl")
@ViewScoped
public class ProductoCtrl implements Serializable {
     private static final long serialVersionUID = 1L;
    private Producto selected;
    private boolean est;
    private ProductoDAO catdao;
    private List<Producto> list = new ArrayList<Producto>();
    

    public ProductoCtrl() {
        this.selected = new Producto();
        this.catdao = new ProductoCtrlImpl();
    }

    public void createProducto() {        
        if (catdao.createProducto(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public List<Producto> getList() {
        list = catdao.readProducto();
        return list;
    }
    public void prepareUpdate(Producto pro){
    //this.selected = new Categoria();
        System.out.println("hola cattttt ");
    this.selected = pro;
    }
    public void updateProducto() {
        System.out.println("Id producto = "+selected.getId_producto());
        System.out.println("valor de edit "+selected.getNombre());
        if (catdao.updateProducto(selected)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("Error al momento de actualizar");
        }
        
    }
    public void deleteProducto(String id){
        
        if (catdao.deleteProducto(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }
    
    
}
