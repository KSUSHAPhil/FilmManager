import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {
    Manager manager = new Manager();
//    private String[] movies = new String[0];

    @Test
    void addFilm() {
        manager.add("Тарзан");
        manager.add("Тарзан");
        manager.getMovies();

        assertEquals(2, manager.getMovies());
    }

    @Test
    void findAllFilms() {
        manager.add("Cow");
        manager.add("Rat");
        manager.findAll();

        Assertions.assertArrayEquals(new String[]{"Cow", "Rat"}, manager.findAll());
    }

    @Test
    void minLehgth() {
        manager.add("Cow");
        manager.add("Rat");
        manager.findLast();

        Assertions.assertArrayEquals(new String[]{"Rat", "Cow"}, manager.findLast());
    }

    @Test
    void maxLehgth() {
        manager.add("Rat");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Cow");
        manager.add("Dog");
        manager.findLast();

        Assertions.assertArrayEquals(new String[]{"Dog", "Cow", "Cow", "Cow", "Cow", "Cow", "Cow", "Cow", "Cow", "Cow"}, manager.findLast());
    }
}
