public class Riviste extends Materiale {
    private String R = "R";
    private int anno, nrRivista;
    private static int contatoreR = 1;

    Materiale materiale = new Materiale(getTitolo(), getGenere(), getIdBiblioteca(),
            isDisponibile(), getEditore());

    public Riviste( String titolo, String genere, String idBiblioteca, Boolean disponibile,
            String editore, int anno, int nrRivista) {
        super(titolo, genere, idBiblioteca, disponibile, editore);

        this.anno = anno;
        this.nrRivista = nrRivista;
        this.codiceInterno = R + String.format("%04d", contatoreR++);
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getNrRivista() {
        return nrRivista;
    }

    public void setNrRivista(int nrRivista) {
        this.nrRivista = nrRivista;
    }

    @Override
    public String toString() {
        return "Riviste \n"
                + "[codice interno= " + codiceInterno + ", \n"
                + ", anno= " + anno + ", \n"
                + ", nrRivista= " + nrRivista + ", \n"
                + ", materiale= " + materiale + "]";
    }

}
