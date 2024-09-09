/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.sistemadealarmas;

/**
 *
 * @author nunez
 */
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 *  Como se supone que los microservicios tienen su propia base de datos enonces seria correcto almacenar el historial de alarmas en el dispositivo
 * @author nunez
 */
public class Archivo {
    CSVReader reader;
    String archivoEntrenamiento;
    public Archivo(String nombre) throws FileNotFoundException
    {
        archivoEntrenamiento = System.getProperty("user.dir") + "\\src\\main\\java\\com\\company\\sistemadealarmas\\"+nombre;    
    } 
    
    
    
   
    public boolean existeArchivo(String ruta)
    {
        File archivo =  new File(ruta);
        return archivo.exists();
    
    
    }
    
    public List<String[]> leerArchivoCSVEntrenamiento() throws IOException
    {
        
        List<String[]>bancoDePalabras = new ArrayList<>();
        
        
        if(existeArchivo(archivoEntrenamiento)){
            try {
         CSVReader lector = new CSVReader(new FileReader(archivoEntrenamiento));
         bancoDePalabras = lector.readAll();
      } catch (IOException e) {
          e.printStackTrace();
          System.out.println("Error al leer ");
         
      } finally {
         if (null != reader) {
            reader.close();
         } 
      }
        }
        return bancoDePalabras;
    }
    
    
    
    
    
    public void escribirArchivoCSVSinCabecera( List<String[]> valores) throws IOException
    {
        
        CSVWriter escribir = new CSVWriter(new FileWriter(archivoEntrenamiento));  
        //escribir.writeNext(cabecera);
        escribir.writeAll(valores);
        escribir.close();
        //write all para esribir todo, write next pata arreglos
    }
  
}

