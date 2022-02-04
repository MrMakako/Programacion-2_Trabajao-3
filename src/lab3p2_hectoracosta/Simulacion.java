
package lab3p2_hectoracosta;

import Vehiculos.*;
import javax.swing.JOptionPane;

public class Simulacion {
    
    private Transporte Transporte;
    
    public void subirAlumno(Estudiante alumno){
        if(Transporte.getEstudiantes().size() <= Transporte.getCapacity()){
            Transporte.addAlumno(alumno);
        }else{
            JOptionPane.showMessageDialog(null, "Transporte lleno");
        }
    };
    
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
    
    
    
}
