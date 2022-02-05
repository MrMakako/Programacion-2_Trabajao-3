
package lab3p2_hectoracosta;

import Vehiculos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Simulacion {
    
    public Transporte Transporte;
    private Transportista Driver;
    private ArrayList<Estacion> estaciones = new ArrayList();



    
    public void subirAlumno(Estudiante alumno){
        if(Transporte.getEstudiantes().size() <= Transporte.getCapacity()){
            Transporte.addAlumno(alumno);
        }else{
            JOptionPane.showMessageDialog(null, "Transporte lleno");
        }
    };

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void Menu(){


            System.out.println("0. Salir\n" +
                    "1. Subir alumno al transporte\n" +
                    "2. Bajar alumno del transporte\n" +
                    "3. Listar alumnos del transporte\n" +
                    "4. Escoger transportista\n" +
                    "5. Quitar transportista\n" +
                    "6. Añadir ruta\n" +
                    "7. Quitar ruta\n" +
                    "8. Imprimir transporte\n" +
                    "9. Comenza");






    }


    public void setTransporte(Vehiculos.Transporte transporte) {
        Transporte = transporte;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public void bajarAlumno(Estudiante alumno){
        Transporte.getEstudiantes().remove(alumno);
    }
    
    public void listarAlumnos(){
        String estudiantesBus = "";
        for (Estudiante estudiante : Transporte.getEstudiantes()) {
            estudiantesBus += "\n" + estudiante + "\n";
        }
        JOptionPane.showMessageDialog(null,estudiantesBus);
    }
    
    public void escogerTransportista(Transportista driver){
        this.Driver=driver;
    }
    
    public void quitarTransportista(){
        this.Driver = null;
    }
    
    public void addRuta(Estacion estacion){
        this.estaciones.add(estacion);
    }
    
    public void quitarRuta(Estacion estacion){
        this.estaciones.remove(estacion);
    }
    
    public void printTransporte(){
       JOptionPane.showMessageDialog(null, this.Transporte);
    }
    
    public void start(){
        
        ArrayList<Estacion> estacionesCopy = this.estaciones;
        Transporte transporteCopy = this.Transporte;
        Transportista driverCopy = this.Driver;
        Estacion actual = estacionesCopy.get(0);
      
        if(transporteCopy.getEstudiantes().size() > 0){
            
            if(!driverCopy.equals(null)){
                while(transporteCopy.getEstudiantes().size() >0){
                    System.out.println("Estacion acutal: " + actual);
                    System.out.println("Estudiantes en el bus: " + transporteCopy.getEstudiantes().size());
                    int bajan = transporteCopy.getEstudiantes().size()/estacionesCopy.size();            
                    System.out.println("Bajan: " + bajan);
                    for (int i = 0; i < bajan; i++) {
                        bajarAlumno(transporteCopy.getEstudiantes().get(i));
                    }
                    estacionesCopy.remove(actual);
                    actual = closestStation(actual,estacionesCopy);
                    System.out.println("Siguiente estacion: " + actual);
                }
                System.out.println("Ruta Finalizada");
            }else{
                System.out.println("Se necesita un transportista para iniciar");
            }
        }else{
            System.out.println("El bus no puede salir vacio, agregue estudiantes");
        }
        
       
        
    }
    
    private Estacion closestStation( Estacion estacionActual , ArrayList<Estacion> estaciones){
        int x1 = estacionActual.getX();
        int y1 = estacionActual.getY();
        
        ArrayList<Double> distancias = new ArrayList<Double>();
        
        for (Estacion estacione : estaciones) {
            
                int x2 = estacione.getX();
                int y2 = estacione.getY();
                double par1 = Math.pow(x2-x1, 2);
                double par2 = Math.pow(y2-y1, 2);
                double ans = Math.sqrt(par1+par2);
                distancias.add(ans);
            
        }
        
        double minDistance  = distancias.get(0);
        for (Double distancia : distancias) {
           if(distancia < minDistance){
               minDistance = distancia;
           }
        }
        
        int index1 = distancias.indexOf(minDistance);
        Estacion masCercana = estaciones.get(index1);
        
        return masCercana;
    }
    public void ListarEstaciones(){
        int index=0;
        for (Estacion c:estaciones){
            System.out.println(index+"-"+c.toString());
            index ++;
        }



    }
    
}
