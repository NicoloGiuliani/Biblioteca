public class Libri extends Materiale {
    private String autore, L = "L";
    private int nrPagine, isbn;
    private static int contatoreL = 0;

    Materiale materiale = new Materiale(getCodiceInterno(), getTitolo(), getGenere(), getIdBiblioteca(),
            isDisponibile(), getEditore());

    public Libri(String codiceInterno, String titolo, String genere, String idBiblioteca, Boolean disponibile,
            String editore, String autore, int nrPagine, int isbn) {
        super(codiceInterno, titolo, genere, idBiblioteca, disponibile, editore);
        this.autore = autore;
        this.nrPagine = nrPagine;
        this.isbn = isbn;

        materiale.codiceInterno = L + String.format("%4d", contatoreL++);
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
