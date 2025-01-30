import java.util.HashMap;

public class Biblioteca {
    private static Biblioteca biblioteca;
    private String via, città;
    private int cap, civico, id;
    public static HashMap<String, Materiale> catalogo = new HashMap<>();
    public static HashMap<Integer, Biblioteca> biblioteche = new HashMap<>();

    public Biblioteca(String via, String città, int cap, int civico, int id) {
        this.via = via;
        this.città = città;
        this.cap = cap;
        this.civico = civico;
        this.id = id;
        biblioteche.put(id, this);
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getCivico() {
        return civico;
    }

    public void setCivico(int civico) {
        this.civico = civico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public static void aggiungiMateriale(Materiale materiale) {
        if (materiale == null) {
            throw new IllegalArgumentException("Non puoi aggiungere un materiale nullo");
        }
        catalogo.put(materiale.getCodiceInterno(), materiale);
    }

    public static Boolean verificaDisponibilita(String codice) {
        if (catalogo.containsKey(codice)) {
            if (catalogo.get(codice).isDisponibile()) {
                return catalogo.containsKey(codice) && catalogo.get(codice).isDisponibile();
            }
            System.out.println("Codice trovato ma non disponibile");
            return null;
        }
        System.out.println("Codice non trovato");
        return null;
    }

    public static Boolean effettuaPrestito(String codice) {
        if (!catalogo.containsKey(codice)) {
            System.out.println("Codice non trovato");
            return false;
        }
        if (catalogo.get(codice).isDisponibile()) {
            catalogo.get(codice).setDisponibile(false);
            return true;
        }
        System.out.println("libro non disponibile");
        return false;
    }

    public static Boolean restituisciPrestito(String codice) {
        if (!catalogo.containsKey(codice)) {
            System.out.println("Codice non trovato");
            return false;
        }
        if (!catalogo.get(codice).isDisponibile()) {
            catalogo.get(codice).setDisponibile(true);
            return true;
        }
        System.out.println("libro non disponibile");
        return false;
    }


    public static void trovaBiblioteca(int id) {
        if (biblioteche.containsKey(id)) {
            System.out.println(biblioteca.toString());
        } else {
            System.out.println("Biblioteca non trovata");
        }
    }

    public static void trovaCollocazione(String codice) {
        if (catalogo.containsKey(codice)) {
            System.out.println(catalogo.get(codice).getIdBiblioteca());
        } else {
            System.out.println("Codice non trovato");
        }
    }
    
    @Override
    public String toString() {
        return "Biblioteca " + "\n"
                + "via=" + via + ",\n"
                + "città=" + città + ",\n"
                + "cap=" + cap + ",\n"
                + "civico=" + civico + ",\n"
                + "id=" + id + "\n";
    }
}
