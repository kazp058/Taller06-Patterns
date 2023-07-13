/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.espol.taller06_patrones;

import singleton.FileHandler;
import adapter.*;

/**
 *
 * @author CltControl
 */
public class Taller06_Patrones {

    public static void main(String[] args) {
        //Ejemplo de como se hace instanciacion del Singleton.
        FileHandler handler = FileHandler.getInstance();
        
        
        
        
        
        //Ejemplo de como implementar el Patrón adapter
        // Crear instancias de los servicios y adaptadores
        NotificacionExterna notificacionExterna = new NotificacionExterna();
        NotificacionAdapter notificacionAdapter = new NotificacionExternaAdapter(notificacionExterna);
        
        // Configurar el adaptador deseado en el sistema
        NotificacionConcreta notification = new NotificacionConcreta();
        notification.setAdapter(notificacionAdapter);

        // Enviar una notificación a través del adaptador configurado
        notification.sendNotification(); // Enviando notificación por WhatsApp
    }
}
