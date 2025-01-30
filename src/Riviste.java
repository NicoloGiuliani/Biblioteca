public class Riviste extends Materiale {
    private String R = "R";
    private int anno, nrRivista;
    private static int contatoreR = 0;

    Materiale materiale = new Materiale(getCodiceInterno(), getTitolo(), getGenere(), getIdBiblioteca(),
            isDisponibile(), getEditore());

    public Riviste(String codiceInterno, String titolo, String genere, String idBiblioteca, Boolean disponibile,
            String editore, String r, int anno, int nrRivista) {
        super(codiceInterno, titolo, genere, idBiblioteca, disponibile, editore);

        this.anno = anno;
        this.nrRivista = nrRivista;
        materiale.codiceInterno = R + String.format("%4d", contatoreR++);
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
                + "[R=" + R + ", \n"
                + ", anno=" + anno + ", \n"
                + ", nrRivista=" + nrRivista + ", \n"
                + ", materiale=" + materiale + "]";
    }

}
