package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PotenciaTest {
    //Potencia pow;
    //Multiplicador mult;
    Somador somador;
    Numero valor;


    @BeforeEach
    public void setup() {
        somador = new Somador();
        //mult = new Multiplicador(somador);
        //pow = new Potencia(mult);
    }

    @Test
    public void powIntegrationTest() {
        valor = new Numero(5);

        //fat.fatorial(valor);

        int expected = 25;
        //assertEquals(expected, pow.resultado().valor());
    }
}