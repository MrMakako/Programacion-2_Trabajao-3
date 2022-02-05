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
public class Rapidito extends Transporte{
    
    private int seats;

    public Rapidito(int seats, String plate, String color) {
        super(plate, color);
        this.seats = seats;
      
        this.capacity = seats;
    }
    
    /**
     * Get the value of seats
     *
     * @return the value of seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Set the value of seats
     *
     * @param seats new value of seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

}
