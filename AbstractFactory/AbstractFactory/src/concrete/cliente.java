/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concrete;

import Abstract.IFabricaNotificaciones;
import Abstract.INotificacion;


/**
 *
 * @author jharif
 */
public class cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una notificación de tipo Email
        IFabricaNotificaciones fabricaEmail = new FabricaEmail();
        INotificacion notificacionEmail = fabricaEmail.crearNotificacion();
        notificacionEmail.enviar("¡Hola! Este es un mensaje por Email.");

        // Crear una notificación de tipo SMS
        IFabricaNotificaciones fabricaSMS = new FabricaSMS();
        INotificacion notificacionSMS = fabricaSMS.crearNotificacion();
        notificacionSMS.enviar("¡Hola! Este es un mensaje por SMS.");
    }
    
}
