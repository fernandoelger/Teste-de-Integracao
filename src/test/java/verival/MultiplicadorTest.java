package verival;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicadorTest {
    //Multiplicador mult;
    Somador somador;
    Numero num;
    Numero outro;


    @BeforeEach
    public void setup() {
        somador = new Somador();
        //mult = new Multiplicador(somador);
    }

    @Test
    public void multiplicationIntegrationTest() {
        num = new Numero(2);
        outro = new Numero(10);

        //mult.set(valor);
        //mult.vezes(outro);

        int expected = 20;
        //assertEquals(expected, mult.resultado().valor());
    }

    @Test
    public void divisionIntegrationTest() {
        num = new Numero(15);
        outro = new Numero(3);

        //mult.set(valor);
        //mult.dividido(outro);
        
        int expected = 5;
        //assertEquals(expected, mult.resultado().valor());
    }
}