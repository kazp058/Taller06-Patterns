/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.File;

/**
 *
 * @author CltControl
 */
public class FileHandler {
    //guarda la unica instancia.
    private static FileHandler instance;
    
    private FileHandler(){
        //Constructor privado para prevenir 
        //instanciacion fuera de esta clase
    }
    
    public static FileHandler getInstance(){
        //Permite acceder a la unica instancia
        if(instance == null){
            instance = new FileHandler();
        }
        return instance;
    }
    
    public File openFile(String location){
        //Logica para abrir el archivo
        return new File(location);
    }
    
    public void writeFile(File file){
        //Logica para guardar el archivo
    }
    
}
