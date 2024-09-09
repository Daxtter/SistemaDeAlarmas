/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.sistemadealarmas;

/**
 *
 * @author nunez
 */
public class Medio {
    String medio;

    public Medio(String Medio) {
        this.medio = Medio;
    }
    
    public void enviarMensaje(Alarma alarma){
        switch(this.medio){
            case "facebook" -> {
                envioDeAlamrPorFacebook(alarma.getMensaje());
            }
            case "telegram" -> {
                envioDeAlamrPorTelegram(alarma.getMensaje());
            }
            case "twiter" -> {
                envioDeAlamrPorTwiter(alarma.getMensaje());
            }
            case "email" -> {
                envioDeAlamrPorEmail(alarma.getMensaje());
            }
        }
    }
    
   
    private void envioDeAlamrPorFacebook(String mensaje){
        //Aqui se comunicará con Facebook
    }
    private void envioDeAlamrPorEmail(String mensaje){
        //Aqui se comunicará con Email
    }
    private void envioDeAlamrPorTelegram(String mensaje){
        //Aqui se comunicará con Telegram
    }
    private void envioDeAlamrPorTwiter(String mensaje){
        //Aqui se comunicará con Twiter
    }
}

