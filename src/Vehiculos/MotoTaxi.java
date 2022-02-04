/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author ThunderKnight
 */
public class MotoTaxi extends Transporte {

    public MotoTaxi(String plate, String color, String driver) {
        super(plate, color, driver);
        this.capacity = 2;
    }
    
}
