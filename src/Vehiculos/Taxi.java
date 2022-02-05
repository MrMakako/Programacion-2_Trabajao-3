/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;
import lab3p2_hectoracosta.Estudiante;

/**
 *
 * @author ThunderKnight
 */
public class Taxi extends Transporte{

    private int taxiNumber;

    public Taxi(int taxiNumber, String plate, String color) {
        super(plate, color);
        this.taxiNumber = taxiNumber;
        this.capacity = 4;
    }
    /**
     * Get the value of taxiNumber
     *
     * @return the value of taxiNumber
     */
    public int getTaxiNumber() {
        return taxiNumber;
    }

    /**
     * Set the value of taxiNumber
     *
     * @param taxiNumber new value of taxiNumber
     */
    public void setTaxiNumber(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
}
