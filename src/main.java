/* Hu Alberto - 1279840 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Estudiante> capAlumnos = new ArrayList<Estudiante>();

        capAlumnos.add(new Estudiante("127B", "Ivan", "Algebra", 99));
        capAlumnos.add(new Estudiante("119A", "Alberto", "Geografia", 60));
        capAlumnos.add(new Estudiante("192C", "Levis", "Historia", 67));
        capAlumnos.add(new Estudiante("147A", "Cindy", "Fisica", 58));
        capAlumnos.add(new Estudiante("124C", "Armando", "Biologia", 66));

        Scanner sn = new Scanner(System.in);
        Estudiante alumnos = new Estudiante();

        Scanner scn = new Scanner(System.in);
        boolean salida = false;
        int opcion; //Guardaremos la opcion del usuario


        while (!salida) {
            System.out.println("\nElige una de las siguientes opciones: ");

            System.out.println("Opcion 1: Captura de Alumnos");
            System.out.println("Opcion 2: Mostrar Alumnos");
            System.out.println("Opcion 3: Salir del programa");

            try {
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Opcion 1: Captura de Alumnos");
                        alumnos.asignarNombre(scn);
                        capAlumnos.add(alumnos);
                    }
                    case 2 -> {
                        System.out.println("Opcion 2: Mostrar Alumnos\n");
                        capAlumnos.forEach((a) -> System.out.println(a.toString()));
                    }
                    case 3 -> salida = true;
                    default -> System.out.println("Solo números entre 1 y 3\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nIngresa un número valido");
                sn.next();
            }
        }
    }
}








