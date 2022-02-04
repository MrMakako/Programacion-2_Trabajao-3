package lab3p2_hectoracosta;

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

    public static BaseDatos BaseDatos= new BaseDatos();









    public static void main(String args[]) {






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






                }
                case 2: {
                    System.out.println("Crear Ruta");












                   break;




                }

                case 3: {

                    System.out.println("Crear Alumno ");

                    BaseDatos.AddEstudiante(EntradaStr("Nombe>>"),EntradaInt("Id>>"),EntradaFecha(),EntradaInt("Id Estudaiante>"));




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





                }
                case 6:{


                }

                case 7:{



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
