/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concrete;

import Abstract.IFabricaNotificaciones;
import Abstract.INotificacion;

/**
 *
 * @author jharif
 */
public class FabricaSMS implements IFabricaNotificaciones {

    @Override
    public INotificacion crearNotificacion() {
        return new NotificacionSMS();
    }

}
