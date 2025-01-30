public class Libri extends Materiale {
    private String autore, L = "L";
    private int nrPagine, isbn;
    private static int contatoreL = 1;

    Materiale materiale = new Materiale(getTitolo(), getGenere(), getIdBiblioteca(),
            isDisponibile(), getEditore());

    public Libri(String titolo, String genere, String idBiblioteca, Boolean disponibile,
            String editore, String autore, int nrPagine, int isbn) {
        super(titolo, genere, idBiblioteca, disponibile, editore);
        this.autore = autore;
        this.nrPagine = nrPagine;
        this.isbn = isbn;

        this.codiceInterno = L + String.format("%04d", contatoreL++);
        //this.setCodiceInterno(L + String.format("%04d", contatoreL++));
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
                + "[codice interno= " + codiceInterno + ", \n"
                + ", autore= " + autore + ", \n"
                + ", nrPagine= " + nrPagine + ", \n"
                + ", isbn= " + isbn + ", \n"
                + ", materiale= " + materiale + "]";
    }

}
