
package lab3p2_hectoracosta;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Persona {

    private int studentId;
    private ArrayList<Clase> classList = new ArrayList();
    
    public Estudiante() {
    }

    public Estudiante(String name, int id, Date birthday, int studentId) {
        super(name, id, birthday);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Clase> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<Clase> classList) {
        this.classList = classList;
    }
    
    public void addClass(Clase clase){
        this.classList.add(clase);
    }
    
}
