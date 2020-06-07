package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SomadorTest {
    Somador somador;
    Numero num;
    Numero outro;


    @BeforeEach
    public void setup() {
        somador = new Somador();
    }

    @Test
    public void sumIntegrationTest() {
        num = new Numero(5);
        outro = new Numero(3);

        somador.set(num);
        somador.mais(outro);

        int expected = 8;
        assertEquals(expected, somador.resultado().valor());
    }

    @Test
    public void subtractionIntegrationTest() {
        num = new Numero(20);
        outro = new Numero(10);

        somador.set(num);
        somador.menos(outro);

        int expected = 10;
        assertEquals(expected, somador.resultado().valor());
    }
}