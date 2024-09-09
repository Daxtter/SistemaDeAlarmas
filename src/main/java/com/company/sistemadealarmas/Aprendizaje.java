/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.sistemadealarmas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nunez
 */
public class Aprendizaje {
    public static void guardarAlarma(Alarma alarma) throws FileNotFoundException, IOException{
        Archivo archivo = new Archivo("baseDeDatosDispositivoSA");
        List<String[]> alarmas = archivo.leerArchivoCSVEntrenamiento();
        String[] cadena = new String[2];
        cadena [0] = alarma.toString(); 
        alarmas.add(cadena);
        archivo.escribirArchivoCSVSinCabecera(alarmas);
    }
    public static Alarma recomendarAlarma(){
        Alarma alarma = new Alarma();
        //Aqui estaria el algoritmo para la recomendacion de la alarma
        return alarma;
    }
    
    
}
