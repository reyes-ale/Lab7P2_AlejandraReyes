/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_alejandrareyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class administrarProd {
    protected ArrayList<Producto> listaProductos = new ArrayList();
    protected File archivo = null;

    public administrarProd(String path) {
        archivo = new File(path);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setProducto(Producto p) {
        this.listaProductos.add(p);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            int cont=0;
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
             bw.write("id, name, category, price, aisle, bin");
            for (Producto t : listaProductos) {
                if (cont==0){
                bw.newLine();
                bw.write(t.getId()+ ",");
                bw.write(t.getNombre()+ ",");
                bw.write(t.getCategory()+ ",");
                bw.write(t.getPrecio()+ ",");
                bw.write(t.getAisle()+ ",");
                bw.write(t.getBin()+ "");
                }
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProductos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {listaProductos.add(new Producto(sc.nextInt(), sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.next(),sc.nextDouble()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
    
    
    
    
    
}
