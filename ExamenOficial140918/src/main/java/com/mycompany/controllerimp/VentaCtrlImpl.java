/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimp;

/**
 *
 * @author CLEISER
 */
public class VentaCtrlImpl implements VentaDAO {
     Conexionbd cx;
    String sql;
    ResultSet rs;
    List<Venta> listDatos;

    public VentaCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createVenta(Venta ve) {
        sql = "INSERT INTO public.producto(id_producto,id_categoria,id_unimed, nombre,descripcion,codigo) "
                + "VALUES("+ve.getId_producto()+",'"+ve.getId_categoria()+"','"+ve.getId_unimed()+"','"+ve.getNombre()+"','"+pro.getDescripcion()+"','"+pro.getCodigo()+"')";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Venta> readVenta() {
        listDatos = new ArrayList<>();
        sql = "SELECT id_producto,id_categoria,id_unimed, nombre,descripcion,codigo "
                + "    FROM public.producto";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Venta(rs.getString("id_producto"),rs.getString("id_categoria"),rs.getString("id_unimed"), rs.getString("nombre"),rs.getString("descripcion"),rs.getString("codigo")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (ArrayList<Venta>) listDatos;
    }

    @Override
    public boolean updateVenta(Venta ve) {
        sql = "UPDATE public.producto SET "
                + "id_categoria = '"+pro.getId_categoria()+"',id_unimed = '"+pro.getId_unimed()+"', nombre = '"+pro.getNombre()+"', descripcion = '"+pro.getDescripcion()+"',codigo = '"+pro.getCodigo()+"' "
                + "WHERE id_producto = "+pro.getId_producto()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteProducto(String id) {
        sql = "DELETE FROM public.producto "
                + "WHERE id_producto = "+id+" ";
        return cx.executeInsertUpdate(sql);
    }
    
}
