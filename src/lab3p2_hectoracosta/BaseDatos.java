package lab3p2_hectoracosta;

import Vehiculos.Estacion;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Date;

public class BaseDatos {
    ArrayList<Clase> ListaClases = new ArrayList<Clase>();
    ArrayList<Transportista>ListaTransportistas =  new ArrayList<Transportista>();
    ArrayList<Estudiante> ListaEstudiantes= new ArrayList<Estudiante>();
    ArrayList<Estacion> ListaEstaciones= new ArrayList<Estacion>();
    ArrayList<Integer> Codigos= new ArrayList<Integer>();





    public void BaseDatos(){






    }

    public int Findcode(int code){
        if(Codigos!=null){
            for(int n :Codigos){
                if(n==code){
                    return -1;
                }
            }

        }
        return 0;


    }

    public void AddEstacion(int x,int y,String nombre ){
        ListaEstaciones.add(new Estacion(x,y,nombre));

    }





    public void AddEstudiante(String name, int id, Date birthday, int studentId ){
        ListaEstudiantes.add(new Estudiante(name,id,birthday,studentId));
        Codigos.add(id);
        Codigos.add(studentId);












    }



    public void AddTransportista(String name, int id, Date birthday, int expYears, String nickName){
        ListaTransportistas.add(new Transportista(name,id,birthday,expYears,nickName));
        Codigos.add(id);








    }

    public ArrayList<Estacion> getListaEstaciones() {
        return ListaEstaciones;
    }

    public void AddClase(String nombre, int id ){
        ListaClases.add(new Clase(nombre,id));
        Codigos.add(id);


        
    }


    public void printClases(){
        int index=0;

        for(Clase c:ListaClases){

            System.out.println(index+"-"+c.toString());
            index++;

        }
        System.out.println("--------");


    }

    public void printEstudiantes(){
        int index=0;
        for(Estudiante c:ListaEstudiantes){
            System.out.println(index+"-"+c.toString());
            index=0;


        }
        System.out.println("--------");




    }

    public void printTransportistas(){
        int index=0;
        for(Transportista c: ListaTransportistas){
            System.out.println(index+"-"+c.toString());
            index++;



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


    public Clase  getClase(int index){
        return ListaClases.get(index);


    }

    public void EstudianteClase(int index,Clase c){

        ListaEstudiantes.get(index).addClass(c);



    }







}
