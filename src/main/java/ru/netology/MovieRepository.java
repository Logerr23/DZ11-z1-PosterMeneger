package ru.netology;

public class MovieRepository {
    private MovieItem[] items = new MovieItem[0];
    private int limitLength;

    public MovieRepository() {
        this.limitLength = 10;
    }
    public MovieRepository(int limitLength){
        this.limitLength = limitLength;
    }

    public void addMovie(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length -1] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (items.length < limitLength){
            resultLength = items.length;
        } else {
            resultLength = limitLength;
        }
        MovieItem[] reversed = new MovieItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
