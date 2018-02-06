/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author Eric Rangel
 */
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Molde carrito1 = new Molde();
        //carrito1.color = "Aqua blue";
        System.out.println("El color es: "+ carrito1.color);
        System.out.println("La marca es: "+ carrito1.marca);
        System.out.println("La transmisión: "+ carrito1.transmision);
        System.out.println("Num. Puertas: "+ carrito1.puertas);
        
    }
    
}
