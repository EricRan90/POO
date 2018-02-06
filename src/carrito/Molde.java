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
public class Molde {

    public String color, modelo, transmision, marca;
    public int puertas;
    
    //Constructor
    public Molde() {
        marca = "Unknow";
        color = "Not available";
        modelo = "Not available";
        transmision = "Not available";
        puertas = 0;
    }

    public void setColor(String valor) {
        color = valor;
    }

    public void setMarca(String valor) {
        marca = valor;
    }
}
