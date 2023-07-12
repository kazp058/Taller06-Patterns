/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.espol.taller06_patrones;

import singleton.FileHandler;

/**
 *
 * @author CltControl
 */
public class Taller06_Patrones {

    public static void main(String[] args) {
        //Ejemplo de como se hace instanciacion del Singleton.
        FileHandler handler = FileHandler.getInstance();
    }
}
