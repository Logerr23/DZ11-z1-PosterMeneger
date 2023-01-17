package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryTest {
    MovieItem item1 = new MovieItem(1, "Бладшот", 2020, "боевик");
    MovieItem item2 = new MovieItem(2, "Вперед", 2020, "мультфильм");
    MovieItem item3 = new MovieItem(3, "Отель Белград", 2020, "комедия");
    MovieItem item4 = new MovieItem(4, "Джентельмены", 2019, "боевик");
    MovieItem item5 = new MovieItem(5, "Человек-невидимка", 2020, "ужасы");
    MovieItem item6 = new MovieItem(6, "Тролли. Мировой тур", 2020, "мультфильм");
    MovieItem item7 = new MovieItem(7, "Номер один", 2020, "комедия");

    MovieRepository repo = new MovieRepository(5);


    @Test
    public void AddMovie() {
        repo.addMovie(item1);
        repo.addMovie(item2);
        repo.addMovie(item3);
        repo.addMovie(item4);
        repo.addMovie(item5);
        repo.addMovie(item6);
        repo.addMovie(item7);

        MovieItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        MovieItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesOverTheLimit() {

        repo.addMovie(item1);
        repo.addMovie(item2);
        repo.addMovie(item3);
        repo.addMovie(item4);
        repo.addMovie(item5);
        repo.addMovie(item6);
        repo.addMovie(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesUnderTheLimit() {

        repo.addMovie(item1);
        repo.addMovie(item2);
        repo.addMovie(item3);
        repo.addMovie(item4);


        MovieItem[] expected = {item4, item3, item2, item1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesEqualToTheLimit() {

        repo.addMovie(item1);
        repo.addMovie(item2);
        repo.addMovie(item3);
        repo.addMovie(item4);
        repo.addMovie(item5);


        MovieItem[] expected = {item5, item4, item3, item2, item1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
