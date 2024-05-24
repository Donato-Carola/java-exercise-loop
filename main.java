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

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci nuemro righe");
        int NumRighe = scan.nextInt();

        for (int i = 1; i <= NumRighe; i++) {

            System.err.print(i);

        }

    }
}
