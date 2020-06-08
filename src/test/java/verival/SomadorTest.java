package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SomadorTest {
    Somador somador;
    Numero num;
    Numero outro;


    @BeforeEach
    public void setup() {
        somador = new Somador();
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 8",
                "3, -3, 6",
                "-7, 5, -2",
                "-3, -2, -1"})
    public void sumTest(int num1, int num2, int expected) {
        num = new Numero(num1);
        outro = new Numero(num2);

        somador.set(num);
        somador.mais(outro);

        int actual = somador.resultado().valor();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"3, 5, -2",
                "3, -5, -2",
                "-4, 2, -6",
                "-4, -3, -7"})
    public void subtractionTest(int num1, int num2, int expected) {
        num = new Numero(num1);
        outro = new Numero(num2);

        somador.set(num);
        somador.menos(outro);

        int actual = somador.resultado().valor();

        assertEquals(expected, actual);
    }

    @Test
    public void sumIntegrationTest() {
        num = new Numero(5);
        outro = new Numero(3);

        somador.set(num);
        somador.mais(outro);

        int expected = 8;
        int actual = somador.resultado().valor();

        assertEquals(expected, actual);
    }

    @Test
    public void subtractionIntegrationTest() {
        num = new Numero(20);
        outro = new Numero(10);

        somador.set(num);
        somador.menos(outro);

        int expected = 10;
        int actual = somador.resultado().valor();

        assertEquals(expected, actual);
    }
}