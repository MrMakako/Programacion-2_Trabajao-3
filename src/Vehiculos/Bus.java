package Vehiculos;

import java.util.ArrayList;
import lab3p2_hectoracosta.*;

public class Bus extends Transporte {
    
    private int seats;
    private int standing;
    
    public Bus(String plate, String color) {
        super(plate, color);


    }
    
    /**
     * Get the value of standing
     *
     * @return the value of standing
     */
    public int getStanding() {
        return standing;
    }

    /**
     * Set the value of standing
     *
     * @param standing new value of standing
     */
    public void setStanding(int standing) {
        this.standing = standing;
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
