/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.sistemadealarmas;

import java.util.Date;

/**
 *
 * @author nunez
 */
public class Alarma {
    String mensaje;
    Date fecha;
    Medio tipoDeMedio;

    public Alarma(String mensaje, Date fecha, Medio TipoDeMedio) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.tipoDeMedio = TipoDeMedio;
    }

    Alarma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void enviarMensaje(long tiempo){
        if (tiempo>= fecha.getTime()){
            tipoDeMedio.enviarMensaje(this);
        }
    }
    public String getMensaje() {
        return mensaje;
    }
}
