package mytld.mycompany.vo;

public class MovieVO {
    private String movie_name;
    private String director;
    private String types;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGerne() {
        return types;
    }

    public void setGerne(String gerne) {
        this.types = gerne;
    }

    public MovieVO(String movie_name, String director, String types) {
        this.movie_name = movie_name;
        this.director = director;
        this.types = types;
    }
}
