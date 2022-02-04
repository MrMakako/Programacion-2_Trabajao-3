package lab3p2_hectoracosta;

import java.util.ArrayList;
import java.util.Date;

public class BaseDatos {
    ArrayList<Clase> ListaClases = new ArrayList<Clase>();
    ArrayList<Transportista>ListaTransportistas =  new ArrayList<Transportista>();
    ArrayList<Estudiante> ListaEstudiantes= new ArrayList<Estudiante>();

    public void BaseDatos(){



    }




    public void AddEstudiante(String name, int id, Date birthday, int studentId ){
        ListaEstudiantes.add(new Estudiante(name,id,birthday,studentId));











    }



    public void AddTransportista(String name, int id, Date birthday, int expYears, String nickName){
        ListaTransportistas.add(new Transportista(name,id,birthday,expYears,nickName));







    }


    public void AddClase(String nombre, int id ){
        ListaClases.add(new Clase(nombre,id));

        
    }


    public void printClases(){
        for(Clase c:ListaClases){
            c.toString();


        }
        System.out.println("--------");


    }

    public void printEstudiantes(){
        for(Estudiante c:ListaEstudiantes){
            c.toString();


        }
        System.out.println("--------");




    }



    public ArrayList<Clase> getListaClases() {
        return ListaClases;
    }

    public ArrayList<Transportista> getListaTransportistas() {
        return ListaTransportistas;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }





}
