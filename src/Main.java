import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // psvm
        Scanner sc = new Scanner(System.in); // Oggetto con cui si prendono dati da input

        System.out.println("Inserisci un numero:"); // Stampa, se scrivi sout lo fa già da solo (ci sono varie versioni)
        int numero = sc.nextInt(); //con .next si ricevono stringhe (parole, non frasi intere) con .nextLine si prende la frase
        System.out.println(numero);
        // var serve principalmente per fare assegnazione di un tipo specifico di variabile - BINDING DINAMICO

        /* STRINGHE
        System.out.println("Inserisci una frase:");
        String frase = sc.nextLine();
        System.out.println("Frase letta: " + frase);

        System.out.println("Inserisci una frase:");
        String parola = sc.next();
        System.out.println("Ho letto solo la prima parola: " + parola);
        */
    }

}
