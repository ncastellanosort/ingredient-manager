package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        List<Ingredientes> recetas = new ArrayList<>();

        while (true) {
            System.out.println("Eres todo un chef");
            System.out.println(" ");
            System.out.println("1. Agregar Receta");
            System.out.println("2. Mostrar Receta");
            System.out.println("3. Editar receta");
            System.out.println("4. Cerrar");
            System.out.println(" ");
            System.out.print("Ingrese una opción: ");
            int txt = entrada.nextInt();
            entrada.nextLine();

            switch (txt) {
                case 1 -> {
                    System.out.print("Nombre de la receta: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Cantidad de ingredientes: ");
                    int cantidad = entrada.nextInt();
                    System.out.print("Descripcion: ");
                    String descripcion = entrada1.nextLine();
                    recetas.add(new Ingredientes(nombre, cantidad, descripcion));
                }
                case 2 -> {
                    System.out.println("Recetas:");
                    for (Ingredientes rece : recetas) {
                        System.out.println(rece);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el indice de la receta a editar: ");
                    int indAu = entrada.nextInt();

                    System.out.print("Ingrese el nombre de la nueva receta: ");
                    String nombreNue = entrada2.nextLine();
                    recetas.get(indAu).nombreEditar(nombreNue);

                    System.out.print("Ingrese la cantidad de la nueva receta: ");
                    int cantNue = entrada3.nextInt();
                    recetas.get(indAu).cantEditar(cantNue);

                    System.out.print("Ingrese la descripcion de la nueva receta: ");
                    String descNue = entrada4.nextLine();
                    recetas.get(indAu).descEditar(descNue);
                }
                case 4 -> {
                    System.out.println("Al pan pan y al vino vino.");
                    return;
                }
            }
        }
    }
}
