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
public class MotoTaxi extends Transporte {
    
    public MotoTaxi(String plate, String color, String driver, ArrayList estudiantes) {
        super(plate, color, driver,estudiantes);
        this.capacity = 2;
    }
    
}
