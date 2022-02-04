package lab3p2_hectoracosta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {





    public static void menu(){

        System.out.println("Menu"+
                "\n0. Salir"+
                "\n1. Crear Clase"+
                "\n2. Crear Ruta"+
                "\n3. Crear Alumno"+
                "\n4. Agregar Clase a Alumno"+
                "\n5. Crear Transportista"+
                "\n6. Crear Transporte"+
                "\n7. Simulación"+
                "\n8. Listar Clases"+
                "\n 9. Listar Rutas"+
                "\n 10. Listar Alumnos"+
                "\n11. Listar Transportistas"+
                "\n12. Listar Transportes");





    }

    public static int EntradaInt(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int n=sc.nextInt();
        return n;



    }

    public static String  EntradaStr(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        sc.useDelimiter("\\n");
        String  n=sc.next();
        return n;



    }

    public static Date  EntradaFecha(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Year:");
        int y= sc.nextInt();

        System.out.println("Month");
        int m= sc.nextInt();

        System.out.println("dia");
        int d= sc.nextInt();


        sc.useDelimiter("\\n");
        Date n=new Date (y,m,d);
        return n;



    }


    public static boolean Opciones(int option){

        switch (option){
            case 0:{


                System.out.println("Regresar");
                return false;









            }
            case 1:{

                System.out.println("Subir alumnos al transporte");

                BaseDatos.printEstudiantes();




                Sim.subirAlumno(BaseDatos.getEstudiante(EntradaInt("Estudiante>>")));





                break;
            }
            case 2:{

                System.out.println("Bajar Alumno");

                Sim.listarAlumnos();

                Sim.bajarAlumno(Sim.Transporte.getEstudiantes().get(EntradaInt("Alumno>>")));


                break;}
            case 3:{
                Sim.listarAlumnos();


                break;
            }
            case 4:{
                System.out.println("Escoger transportista");

                BaseDatos.printTransportistas();

                Sim.escogerTransportista(BaseDatos.getTransportista(EntradaInt("Transpotista>>")));

                break;}


            case 5:{

                System.out.println("Transportista Removido");
                Sim.quitarTransportista();



                break;


            }
            case 6:{
                System.out.println("Anadir Ruta");

                BaseDatos.printEstacion();
                Sim.addRuta(BaseDatos.getEstacion(EntradaInt("Estacion>>")));

            }

            case 7:{

                Sim.ListarEstaciones();

                Sim.quitarRuta(Sim.getEstaciones().get(EntradaInt("Estacion>>")));



            }
            case 8:{

                Sim.printTransporte();
            }

            case 9:{
                System.out.println("Empezando");
                Sim.start();

            }








        }

        return true;


    }


    public static BaseDatos BaseDatos= new BaseDatos();
    public static Simulacion Sim=new Simulacion();




    public static int EntradaId(int code){
        if(BaseDatos.Findcode(code)==-1){
            System.out.println("Codigo existente intente de nuevo");
            EntradaId(code);
        }
        System.out.println("Codigo  Valido!!!!!");
        return code;

    }









    public static void main(String args[]) {

        Date l= new Date(LocalDate.now().getYear(), 3,4);

        BaseDatos.AddClase("Fil",12312);
        BaseDatos.AddClase("Mate",82903);
        BaseDatos.AddEstudiante("Diego",232,l,4324);
        BaseDatos.AddEstudiante("pollo",343,l,3434);

        BaseDatos.EstudianteClase(0,BaseDatos.getClase(0));
        BaseDatos.EstudianteClase(1,BaseDatos.getClase(0));










        int option;




        boolean prog = true;
        while (prog) {

            menu();


            System.out.print(">>");
            option = EntradaInt("");


            switch (option) {

                case 0:{
                    System.out.println("saliendo");






                    break;








                }

                case 1: {
                    System.out.println("Crear Clases");

                    String nombre=EntradaStr("Nombre>>");
                    int id=EntradaInt("ID>>");


                    BaseDatos.AddClase(nombre, id);

                    break;






                }
                case 2: {
                    System.out.println("Crear Ruta");



                    BaseDatos.AddEstacion(EntradaInt("Poscion x>>"),EntradaInt("Posicion Y >>"),EntradaStr("Nombre de Estacion"));






                   break;




                }

                case 3: {

                    System.out.println("Crear Alumno ");

                    BaseDatos.AddEstudiante(EntradaStr("Nombe>>"),EntradaInt("Id>>"),EntradaFecha(),EntradaInt("Id Estudaiante>"));


                    break;

                }
                case 4: {
                    System.out.println("Agregar clase a estudainte");
                    BaseDatos.printEstudiantes();
                    int alumno=EntradaInt("Alumno>>");

                    BaseDatos.printClases();
                    int Clase=EntradaInt("Clase>>");

                    BaseDatos.EstudianteClase(alumno,BaseDatos.getClase(Clase));

                    break;




                }
                case 5:{

                    System.out.println("crear transportista");




                    BaseDatos.AddTransportista(EntradaStr("Nombre>>"),EntradaId(EntradaInt("ID>>")),EntradaFecha(),EntradaInt("Exp years>>"),EntradaStr("Nicjname>>"));





                }
                case 6:{


                    System.out.println("Crear Transporte");
                    System.out.println("1-Moto taxi"+"\n2-Rapidito"+"\nBus");


                    break;


                }

                case 7:{


                    System.out.println("Simulacion");

                    boolean sim=true;
                    while (sim){
                        Sim.Menu();
                        sim=Opciones(EntradaInt("opcioh>>"));


                    }


                    break;



                }
                case 8:{
                    BaseDatos.printClases();

                    break;


                }

                case 9:{}

                case 10:{
                    BaseDatos.printEstudiantes();
                    break;
                }


            }


        }





    }



    
}
