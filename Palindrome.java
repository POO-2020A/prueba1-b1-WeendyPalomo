
/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/


import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) {
        String s, alrevez = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.print("In:");
        s = in.nextLine();
        int tam = s.length();
        boolean esPalindromo = true;
        s = s.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");

        for (int i = tam - 1; i >= 0; i--) {
            alrevez = alrevez + s.charAt(i);
        }
        if (s.equals(alrevez)) {
            System.out.println(esPalindromo);
        } else {
            System.out.println(!esPalindromo);
        }
    }
}
