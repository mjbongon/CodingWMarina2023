package UF4.HerenciaMedia;

public class Musica extends Media {
    private String artista;
    private String estil;

    public Musica () {}
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstil() {
        return estil;
    }

    public void setEstil(String estil) {
        this.estil = estil;
    }
}
