/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_marcelarivera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class ArchivoConversacion {
     private Scanner sc = new Scanner(System.in);
    private String texto;
    private File archivo;
    private ArrayList<String> lista;

    public ArchivoConversacion() {
    }

    public ArchivoConversacion(String texto, ArrayList<String> lista) {
        archivo = new File(texto);
        this.lista = lista;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
     public void setPersona(String c){
        lista.add(c);
    }
      public void Escribir() throws Exception {
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String p : lista) {
            String prueba = p+";";
            bw.append(prueba);
        }
        bw.flush();
        bw.close();
        fw.close();
    }
    
    public void Leer() {
        Scanner sc = null;
        lista=new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
            } catch (FileNotFoundException ex) {
            }
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                 String u=sc.next();
                 lista.add(u);
              
        }
    }
    }
     
     
}
