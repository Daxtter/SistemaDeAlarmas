/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.sistemadealarmas;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author nunez
 */
public class Alarma {
    String mensaje;
    Date fecha;
    Medio tipoDeMedio;

    public Alarma(String mensaje, Date fecha, Medio TipoDeMedio) throws IOException {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.tipoDeMedio = TipoDeMedio;
        
    }

    public void guardarAlarma() throws IOException{
        Aprendizaje.guardarAlarma(this);
    }
    Alarma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean enviarMensaje(long tiempo){
        if (tiempo>= fecha.getTime()){
            tipoDeMedio.enviarMensaje(this);
            return true;
        }
        return false;
    }

    
    
    @Override
    public String toString() {
        return "Alarma{" + "mensaje=" + mensaje + ", fecha=" + fecha + ", tipoDeMedio=" + tipoDeMedio + '}';
    }
    
    
    public String getMensaje() {
        return mensaje;
    }
}
