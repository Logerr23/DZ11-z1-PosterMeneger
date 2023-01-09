package ru.netology;

public class MovieItem {
    private int id;
    private String movieName;
    private int reliased;
    private  String genre;

    public MovieItem(int id, String movieName, int reliased, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.reliased = reliased;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReliased() {
        return reliased;
    }

    public void setReliased(int reliased) {
        this.reliased = reliased;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
