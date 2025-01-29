public class Libri extends Materiale {
    private String autore, L="L";
    private int nrPagine, isbn;
    private static int contatore = 0000;
    
    Materiale materiale = new Materiale(getCodiceInterno(), getTitolo(), getGenere(), getIdBiblioteca(), getDisponibile(), getEditore());

    public Libri(String codiceInterno, String titolo, String genere, String idBiblioteca, Boolean disponibile,
            String editore, String autore, int nrPagine, int isbn) {
        super(codiceInterno, titolo, genere, idBiblioteca, disponibile, editore);
        this.autore = autore;
        this.nrPagine = nrPagine;
        this.isbn = isbn;
        
        contatore++;
        System.out.println("codice libro: "+ L + contatore);
        materiale.codiceInterno = L+String.format("%4d", contatore);
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNrPagine() {
        return nrPagine;
    }

    public void setNrPagine(int nrPagine) {
        this.nrPagine = nrPagine;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return "Libri \n"
        + "[autore=" + autore + ",\n"
        + ", nrPagine=" + nrPagine + ",\n"
        + ", isbn=" + isbn + "]";
    }
}
