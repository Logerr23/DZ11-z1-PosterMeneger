package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryTest2 {
    MovieItem item1 = new MovieItem(1, "Бладшот", 2020, "боевик");
    MovieItem item2 = new MovieItem(2, "Вперед", 2020, "мультфильм");
    MovieItem item3 = new MovieItem(3, "Отель Белград", 2020, "комедия");
    MovieItem item4 = new MovieItem(4, "Джентельмены", 2019, "боевик");
    MovieItem item5 = new MovieItem(5, "Человек-невидимка", 2020, "ужасы");
    MovieItem item6 = new MovieItem(6, "Тролли. Мировой тур", 2020, "мультфильм");
    MovieItem item7 = new MovieItem(7, "Номер один", 2020, "комедия");
    MovieItem item8 = new MovieItem(8, "Ральф", 2012, "мультфильм");
    MovieItem item9 = new MovieItem(9, "Уокер", 1987, "вестерн");
    MovieItem item10 = new MovieItem(10, "Удача", 2022, "мультфильм");
    MovieItem item11 = new MovieItem(11, "Освобождение", 2022, "боевик");

    MovieRepository repo = new MovieRepository();


    @Test
    public void FindLastMoviesOverTheLimit() {
        repo.addMovie(item1);
        repo.addMovie(item2);
        repo.addMovie(item3);
        repo.addMovie(item4);
        repo.addMovie(item5);
        repo.addMovie(item6);
        repo.addMovie(item7);
        repo.addMovie(item8);
        repo.addMovie(item9);
        repo.addMovie(item10);
        repo.addMovie(item11);

        MovieItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesUnderTheLimit() {

        repo.addMovie(item1);
        repo.addMovie(item2);
        repo.addMovie(item3);
        repo.addMovie(item4);
        repo.addMovie(item5);
        repo.addMovie(item6);
        repo.addMovie(item7);
        repo.addMovie(item8);
        repo.addMovie(item9);


        MovieItem[] expected = {item9, item8, item7, item6, item5, item4, item3, item2, item1};
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
        repo.addMovie(item6);
        repo.addMovie(item7);
        repo.addMovie(item8);
        repo.addMovie(item9);
        repo.addMovie(item10);


        MovieItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

