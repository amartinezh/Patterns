/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.observer;

/**
 *
 * @author jvelez
 */
public class Stock implements ILibroMalEstado{

    @Override
    public void update() {
        System.out.println("Stock");
        System.out.println("Elimino el libro");
    }
    
}
