/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Kevin Magallanes
 */
public class NotificacionConcreta {
    
    private NotificacionAdapter adapter;

    public void setAdapter(NotificacionAdapter adapter) {
        this.adapter = adapter;
    }
    public void sendNotification() {
        adapter.sendNotification();
    }
    
}
