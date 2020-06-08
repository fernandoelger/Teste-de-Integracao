package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumeroTest {

    private Numero num;

    @Test
    public void incTest() {
        num = new Numero(5);
        num.inc();

        int actual = num.valor();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void decTest() {
        num = new Numero(5);
        num.dec();

        int actual = num.valor();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void absTest() {
        num = new Numero(-5);
        num.abs();

        int actual = num.valor();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void duplicaTest() {
        num = new Numero(10);
        Numero outro = num.duplica();

        int actual = outro.valor();
        int expected = 10;
        assertEquals(expected, actual);
    }
}