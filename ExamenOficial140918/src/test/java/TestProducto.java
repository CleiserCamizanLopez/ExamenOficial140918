
import com.mycompany.controllerimp.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.modell.Producto;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CLEISER
 */
public class TestProducto {
    static ArrayList<Producto> list = new ArrayList<>();
    public static void main(String[] args) {
        ProductoDAO catdao;
        catdao = new ProductoCtrlImpl();
        /*list = catdao.readCategoria();
        for(Categoria item: list){
            System.out.println(""+item.getName_cat());
        }*/
//        Producto pro = new Producto();
//        cat.setId_categoria("9");
//        cat.setName_cat("lacteos");
//        cat.setEstado("1");
//        if(catdao.createProducto(pro)){
//            System.out.println("insertado");
//        }else{
//            System.out.println("error al momento de insertar");
//        }
    }
    
}
    
