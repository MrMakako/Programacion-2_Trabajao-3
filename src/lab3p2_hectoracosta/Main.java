package lab3p2_hectoracosta;

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






    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int option;


        boolean prog = true;
        while (prog) {

            menu();


            System.out.print(">>");
            option = sc.nextInt();


            switch (option) {

                case 1: {


                }
                case 2: {
                }

                case 3: {
                }
                case 4: {
                }
                case 5:{

                    
                }


            }


        }

    }

    
}
