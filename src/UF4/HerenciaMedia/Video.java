package UF4.HerenciaMedia;

public class Video extends Media {
    private String director;
    private String idioma;

    public void Video () {}
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
