package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplicadorTest {
    Multiplicador mult;
    Somador somador;
    Numero num;
    Numero outro;


    @BeforeEach
    public void setup() {
        somador = new Somador();
        mult = new Multiplicador(somador);
    }

    @ParameterizedTest
    @CsvSource({"3, 5, 15",
                "10, -10, -100",
                "-10, 2, -20",
                "-3, -4, 12",
                "0, 5, 0"})
    public void multiplicationTest(int num1, int num2, int expected) {
        num = new Numero(num1);
        outro = new Numero(num2);

        mult.set(num);
        mult.vezes(outro);

        int actual = mult.resultado().valor();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5",
                "25, -5, -5",
                "-30, 10, -3",
                "-100, -10, 10",
                "5, 2, 3",
                "7, 1, 7",
                "7, 1, 7"})
    public void divisionTest(int num1, int num2, int expected) {
        num = new Numero(num1);
        outro = new Numero(num2);

        mult.set(num);
        mult.dividido(outro);

        int actual = mult.resultado().valor();

        assertEquals(expected, actual);
    }
    
    @Test
    public void divideByZeroTest() {

        assertThrows(ArithmeticException.class,
        ()->{
            num = new Numero(7);
            outro = new Numero(0);
            mult.set(num);
            mult.dividido(outro);
        });
    }

    @Test
    public void multiplicationIntegrationTest() {
        num = new Numero(2);
        outro = new Numero(10);

        mult.set(num);
        mult.vezes(outro);

        int expected = 20;
        assertEquals(expected, mult.resultado().valor());
    }

    @Test
    public void divisionIntegrationTest() {
        num = new Numero(15);
        outro = new Numero(3);

        mult.set(num);
        mult.dividido(outro);
        
        int expected = 5;
        assertEquals(expected, mult.resultado().valor());
    }
}