import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int scelta, scelta2;

        Biblioteca biblioteche1 = new Biblioteca("Via Roma", "Milano", 20100, 01, 1);
        Biblioteca biblioteche2 = new Biblioteca("Via Milano", "Roma", 00100, 02, 2);
        Biblioteca biblioteche3 = new Biblioteca("Via Napoli", "Napoli", 80100, 03, 3);
        Biblioteca biblioteche4 = new Biblioteca("Via Torino", "Torino", 10100, 04, 4);
        Biblioteca biblioteche5 = new Biblioteca("Via Firenze", "Firenze", 50100, 05, 5);

        do {
            System.out.println("Menu:");
            System.out.println("1. Aggiungi materiale");
            System.out.println("2. Verifica disponibilità materiale");
            System.out.println("3. Effettua prestito");
            System.out.println("4. Restituisci prestito");
            System.out.println("5. Trova biblioteca");
            System.out.println("6. Trova collocazione materiale");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            System.out.println("---------------------------------");
            switch (scelta) {
                case 1:
                    do {
                        System.out.println("1. aggiungi libro");
                        System.out.println("2. aggiungi rivista");
                        System.out.println("0. Esci");
                        System.out.print("Scegli un'opzione ");
                        scelta2 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("---------------------------------");

                        switch (scelta2) {
                            case 1:
                                System.out.print("Inserisci titolo del libro: ");
                                String titoloLibro = scanner.nextLine();
                                System.out.print("Inserisci genere: ");
                                String genereLibro = scanner.nextLine();
                                System.out.print("Inserisci ID biblioteca: ");
                                String idBiblioteca = scanner.nextLine();
                                System.out.print("Inserisci autore: ");
                                String autore = scanner.nextLine();
                                System.out.print("Inserisci editore: ");
                                String editoreLibro = scanner.nextLine();
                                System.out.print("Inserisci ISBN: ");
                                int isbn = scanner.nextInt();
                                System.out.print("Inserisci numero pagine: ");
                                int nrPagine = scanner.nextInt();
                                System.out.println("Disponibilità immediata?(true/false)");
                                Boolean disponibile = scanner.nextBoolean();
                                
                                Libri libro = new Libri(titoloLibro, genereLibro, idBiblioteca, disponibile, editoreLibro, autore, nrPagine, isbn);
                                Biblioteca.aggiungiMateriale(libro);
                                System.out.println("Libro aggiunto con successo.");
                                System.out.println("---------------------------------");
                                System.out.println(libro.toString());
                                System.out.println("---------------------------------");
                                break;
                            case 2:
                                System.out.print("Inserisci titolo della rivista: ");
                                String titoloRivista = scanner.nextLine();
                                System.out.print("Inserisci genere: ");
                                String genereRivista = scanner.nextLine();
                                System.out.print("Inserisci ID biblioteca: ");
                                String idBibliotecaRivista = scanner.nextLine();
                                System.out.print("Inserisci editore: ");
                                String editoreRivista = scanner.nextLine();
                                System.out.print("Inserisci anno: ");
                                int anno = scanner.nextInt();
                                System.out.print("Inserisci numero rivista: ");
                                int nrRivista = scanner.nextInt();
                                System.out.println("Disponibilità immediata?(true/false)");
                                Boolean disponibileRivista = scanner.nextBoolean();

                                Riviste rivista = new Riviste(titoloRivista, genereRivista, idBibliotecaRivista, disponibileRivista, editoreRivista, anno, nrRivista);
                                Biblioteca.aggiungiMateriale(rivista);
                                System.out.println("Rivista aggiunto con successo.");
                                System.out.println("---------------------------------");
                                System.out.println(rivista.toString());
                                System.out.println("---------------------------------");
                                break;
                            case 0:
                                System.out.println("Grazie per aver aggiunto il materiale");
                                System.out.println("---------------------------------");
                                break;
                            default:
                                System.out.println("Opzione non valida. Riprova.");
                                System.out.println("---------------------------------");
                                break;
                        }
                    } while (scelta2 != 0);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    System.out.println("---------------------------------");
            }
        } while (scelta != 0);

        scanner.close();

    }
}
