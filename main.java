//! Esercizio 1

//Scrivere un programma in Java per visualizzare la tabella di moltiplicazione di un dato numero intero

// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//      System.out.println("inserisci nuemro righe");
//      int NumRighe= scan.nextInt();

//      for (int i = 1; i<=NumRighe; i++){

//             System.err.println(NumRighe + "x" + i + "=" + (NumRighe * i) );

//      }

//     }
// }

//! Eseercizio 2 

//Esercizio 2

// Scrivi un programma in Java per visualizzare i primi 10 numeri naturali.

// Esempio

// Uscita prevista: I primi 10 numeri naturali sono: 1 2 3 4 5 6 7 8 9 10

// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("inserisci nuemro righe");
//         int NumRighe = scan.nextInt();

//         for (int i = 1; i <= NumRighe; i++) {

//             System.err.print(i);

//         }

//     }
// }

//! Esercizio 3

// Scrivi un programma in Java per visualizzare i primi n numeri naturali e la loro somma. n � preso in input

// Esempio

// Dati di test

// Inserisci il numero: 2

// Uscita prevista:

// Numero di input: 2

// I primi n numeri naturali sono: 2, 1

// La somma del numero naturale fino a n termini: 1+2 = 3

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il numero: ");
        int n = scan.nextInt();

        System.out.println("Numero di input: " + n);

        // Inizializza la somma
        int somma = 0;

        // Visualizza i primi n numeri naturali e calcola la somma
        System.out.print("I primi " + n + " numeri naturali sono: ");
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
            somma += i;
        }

        System.out.println(); // Per andare a capo

        // Visualizza la somma dei numeri naturali
        System.out.print("La somma del numero naturale fino a " + n + " termini: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + somma);

    }
}
