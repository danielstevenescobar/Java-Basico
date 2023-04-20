package com.ejercicioTema;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class ejercicio789 {

    /*
     Escribe el codigo que devuelva una cadena al reves.
     por ejemplo, la cadena "hola mundo", debe devover "odnum aloh".
    */

    public static class CadenaReves {

        public static void main(String[] arg) {

            System.out.println("------------------- \n Cadena al Reves\n--------------------");

            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();

            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();

            System.out.println(texto);
        }
    }

    /*
       Crea un array unidimencional de Strings y recorrelo, mostrando unicamente sus valores.
    */
    public static class ArrayUnidimencional {

        public static void main(String[] args) {

            System.out.println("--------------------- \n Array Unidimencional\n--------------------");

            String textos[] = {"Principio ", "Intermedio ", "Conclusion "};

            for (String texto : textos) {
                System.out.println(texto);
            }
        }
    }

    /*
     Crea un array bidimencional de enteros y recorrelo, mostrando la posicion y el valor de cada elemento
     en ambas dimensiones.
    */

    public static class ArrayBidimensional {

        public static void main(String[] args) {

            System.out.println("-------------------\n Array Bidimensional\n------------------");

            Integer[][] numeros = {
                    {5, 10, 15},
                    {20, 25, 30}
            };

            for (int i = 0; i < numeros.length; i++) {

                for (int y = 0; y < numeros[i].length; y++) {

                    System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                            "\nEl valor es: " + numeros[i][y] + "\n");

                }
            }
        }
    }

 /*
    Crea un "Vector" del tipo de dato que prefieras, y añadele 5 elementos.
    Elimina el 2o y 3er elemento y muestra el resultado final.
  */

    public static class EjercicioVector {

        public static void main(String[] args) {

            System.out.println("-------------------\n Vector\n-------------------");

            Vector vector = new Vector();

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);

            System.out.println("Vector antes de borrar: " + vector);

            vector.remove(2);
            vector.remove(1);

            System.out.println("Vector despues de borrar: " + vector + "-> Eliminados el 2 y 3");

        /*
           Indica cual es el problema de utilizar un Vector con la capacidad por defecto si tuviesemos
           1000 elementos para ser añadidos al mismo.
         */

            System.out.println("\n-------------------\n Respuesta\n------------------");

            System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                    " el limite establecido (Por defecto, 10) la dimencion del vector se duplica.");
        }
    }

/*
Crea un Arraylist de tipo String, con 4 elementos. Copialo en una Linkedlist.
Recorre ambos mostrando unicamente el valor de cada elemto.
 */

    public static class ArrayString {

        public static void main(String[] args) {

            System.out.println("--------------------\n Array y Linjedlist\n----------------------");

            ArrayList<String> lista = new ArrayList<>();
            lista.add("Camilo");
            lista.add("Diana");
            lista.add("Albert");
            lista.add("Macarena");

            LinkedList<String> linkedList = new LinkedList<>();

            for (int i = 0; i < lista.size(); i++) {
                linkedList.add(i, lista.get(i));
            }

            System.out.println("Elementos del Array:");
            for (String elementos : lista) {
                System.out.println(elementos + " ");
            }

            System.out.println("\n\nElementos de la Linkedlist:");
            for (String elementos : linkedList) {
                System.out.println(elementos + " ");
            }
        }
    }

    /*
    Crea un Arraylist de tipo int, y , utilizando un bucle rellenalo con elementos 1..10.
    A continuacion, con otro bucle, recorrelo y elimina los numeros pares. Por ultimo, vuelve a recorrerlo
    y muestra el Arraylist final. si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
    el primer "for" de relleno.
     */

    public static class ArrayInt {

        public static void main(String[] args) {

            System.out.println("----------------------\n ArrayInt\n--------------------");

            ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 1; i < 11; i++) {
                lista.add(i);

                for (int num = 0; num < lista.size(); num++) {

                    if (lista.get(num) % 2 == 0) {
                        lista.remove(num);
                    }
                }
            }

            System.out.println(lista);

        }
    }

    /*
    Crea una funcion DividePorCero. Esta, debe generar una excepcion ("throws") a su llamante del tipo
    ArithmeticException que sera capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepcion,
    mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de codigo".
   */

    public static class DividePorCero {

        private static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {

            System.out.println("-------------------\n DividePorCero\n-------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Indica los numeros que quieres dividir: ");
            System.out.println("Numero 1: ");
            int a = scanner.nextInt();
            System.out.println("Numero 2: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Resultado: " + Dividir(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de codigo");
            }
        }

        /*
        Utilizando InputStream y PrintStream, crea una funcion que reciba dos parametros: "fileIn" y "fileOut".
        La tarea de la funcion sera realizar la copia del fichero dado en el parametro "fileIn" al fichero
        dado en "fileOut".
         */

        public static class CopiarFicheros {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el fichero de origen: ");
                String fileIn = scanner.nextLine();
                System.out.println("Introduce el fichero de destino: ");
                String fileOut = scanner.nextLine();
                copiar(fileIn, fileOut);
            }

            private static void copiar(String fileIn, String fileOut) {
                try {
                    InputStream in = new FileInputStream(fileIn);
                    byte[] datos = in.readAllBytes();
                    in.close();

                    PrintStream out = new PrintStream(fileOut);
                    out.write(datos);
                    out.close();
                } catch (Exception e) {
                    System.out.println("Excepcion: " + e.getMessage());
                }
            }
        }
    }
}


