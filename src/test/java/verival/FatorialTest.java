package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FatorialTest {
    Fatorial fat;
    Multiplicador mult;
    Somador somador;
    Numero valor;


    @BeforeEach
    public void setup() {
        somador = new Somador();
        mult = new Multiplicador(somador);
        fat = new Fatorial(mult);
    }

    @ParameterizedTest
    @CsvSource({"0, 1",
                "1, 1",
                "-1, -1",
                "5, 120",
                "-4, -24"})
    void multiplicationTest(int num, int expected) {
        valor = new Numero(num);

        fat.fatorial(valor);

        int actual = fat.resultado().valor();
        assertEquals(expected, actual);
    }

    @Test
    public void factorialIntegrationTest() {
        valor = new Numero(5);

        fat.fatorial(valor);

        int expected = 120;
        assertEquals(expected, fat.resultado().valor());
    }
}