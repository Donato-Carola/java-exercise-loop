//! Esercizio 1

//Scrivere un programma in Java per visualizzare la tabella di moltiplicazione di un dato numero intero


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
     System.out.println("inserisci nuemro righe");
     int NumRighe= scan.nextInt();
     
     for (int i = 1; i<=NumRighe; i++){
            
            System.err.println(NumRighe + "x" + i + "=" + (NumRighe * i) );
        
     }


    }
}