
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AscensorTest {

    private Ascensor ascensor;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void before(){
        // preparacion de prueba
        ascensor = new Ascensor();
    }

    @Test
    public void primeraLlamadaDebeSerPrimerPiso()throws Exception{
        // preparacion de prueba

        // logica de prueba

        // Verificacion o Assert

        Assert.assertEquals(1, ascensor.llamada());
    }

    @Test
    public void elejirUnPisoDentroDelRangoDeLosPisosDelEdificio()throws Exception{
        // preparacion de prueba

        // logica de prueba

        // Verificacion o Assert
        ascensor.control(2);
    }

    @Test
    public void elejirUnPisoFueraDelRangoDeLosPisosDelEdificio()throws Exception{
        // preparacion de prueba

        // logica de prueba

        // Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.control(5);
    }

    @Test
    public void eljirUnPisoQueSeaElMismoEnDondeSeEncuentra()throws Exception{
        // preparacion de prueba

        // logica de prueba

        // Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.control(3);
    }

}
