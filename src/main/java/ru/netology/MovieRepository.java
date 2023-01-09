package ru.netology;

public class MovieRepository {
    private MovieItem[] items = new MovieItem[0];
    private int resultLength = 10;

    public MovieRepository(){

    }
    public MovieRepository(int resultLength){
        this.resultLength = resultLength;
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
        MovieItem[] all = findAll();
        if (resultLength > all.length){
            resultLength = all.length;
        }
        MovieItem[] reversed = new MovieItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;


    }



}
