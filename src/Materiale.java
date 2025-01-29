public class Materiale {
    private String titolo, genere, idBiblioteca, editore;
    public String codiceInterno;
    private Boolean disponibile;

    public Materiale(String codiceInterno, String titolo, String genere, String idBiblioteca, Boolean disponibile, String editore) {
        this.codiceInterno = codiceInterno;
        this.titolo = titolo;
        this.genere = genere;
        this.idBiblioteca = idBiblioteca;
        this.editore = editore;
        this.disponibile = disponibile;

    }

    public String getCodiceInterno() {
        return codiceInterno;
    }

    public void setCodiceInterno(String codiceInterno) {
        this.codiceInterno = codiceInterno;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(String idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public Boolean getDisponibile() {
        return disponibile;
    }

    public void setDisponibile(Boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return "Materiale \n" +
                "[codiceInterno=" + codiceInterno + ",\n"
                + "titolo=" + titolo + ",\n"
                + "genere=" + genere + ",\n"
                + "idBiblioteca=" + idBiblioteca + ",\n"
                + "editore=" + editore + ",\n"
                + "disponibile=" + disponibile + "]";
    }
}
