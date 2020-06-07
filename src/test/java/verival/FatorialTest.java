package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FatorialTest {
    //Fatorial fat;
    //Multiplicador mult;
    Somador somador;
    Numero valor;


    @BeforeEach
    public void setup() {
        somador = new Somador();
        //mult = new Multiplicador(somador);
        //fat = new Fatorial(mult);
    }

    @Test
    public void factorialIntegrationTest() {
        valor = new Numero(5);

        //fat.fatorial(valor);

        int expected = 120;
        //assertEquals(expected, fat.resultado().valor());
    }
}