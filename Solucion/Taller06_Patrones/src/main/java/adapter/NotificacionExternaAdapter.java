/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Kevin Magallanes
 */
public class NotificacionExternaAdapter implements NotificacionAdapter {
   
    private NotificacionExterna notificacion;
    
    public NotificacionExternaAdapter(NotificacionExterna notificacion){
        this.notificacion = notificacion;
    }
    
    @Override
    public void sendNotification() {
        notificacion.sendMessage();
    }
}
