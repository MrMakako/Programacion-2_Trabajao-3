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
public class Transporte {
    
    private String plate; 
    private String color;    
    private String driver;
    public int capacity;
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private ArrayList<Estacion> estaciones = new ArrayList();

    public Transporte(String plate, String color, String driver, ArrayList estudiantes) {
        this.plate = plate;
        this.color = color;
        this.driver = driver;
        this.estudiantes  = estudiantes;
    }

    public void addAlumno(Estudiante alumno){
        this.estudiantes.add(alumno);
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    /**
     * Get the value of driver
     *
     * @return the value of driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Set the value of driver
     *
     * @param driver new value of driver
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(String color) {
        this.color = color;
    }

    
    /**
     * Get the value of plate
     *
     * @return the value of plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * Set the value of plate
     *
     * @param plate new value of plate
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
    
    public void addStation(Estacion estacion){
        this.estaciones.add(estacion);
    }

    
}
