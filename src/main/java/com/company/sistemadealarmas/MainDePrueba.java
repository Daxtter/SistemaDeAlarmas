/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.company.sistemadealarmas;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author nunez
 */
public class MainDePrueba {

    
    public static void main(String[] args) throws IOException {
        
        Alarma alarmaPrueba = new Alarma("Despertarse", new Date(System.currentTimeMillis()+3000), new Medio("consola"));
        alarmaPrueba.guardarAlarma(); //Esta ocasion queremos que nuestra alarma se guarde
        boolean alaramEnviada = false;
        while(!alaramEnviada){
            alaramEnviada = alarmaPrueba.enviarMensaje(System.currentTimeMillis());
           
        }
    
    }
    
}
