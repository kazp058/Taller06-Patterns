/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author radri
 */
public class ColorDecorator extends InformeDecorator{

    public ColorDecorator(Informe informe) {
        super(informe);
    }
    
    @Override
    public void editar() {
        System.out.println("Implementacion InformeDecorator");
    }
    
}
