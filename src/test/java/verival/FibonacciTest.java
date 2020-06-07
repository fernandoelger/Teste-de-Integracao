package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    //Fibonacci fibo;
    Somador somador;
    Numero valor;


    @BeforeEach
    public void setup() {
        somador = new Somador();
        //fibo = new Fibonacci(somador);
    }

    @Test
    public void fibonacciIntegrationTest() {
        valor = new Numero(7);

        //fat.fatorial(valor);

        int expected = 21;
        //assertEquals(expected, fibo.resultado().valor());
    }
}