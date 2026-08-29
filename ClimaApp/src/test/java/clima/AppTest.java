package clima;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void ConvertirCelsiusAFahrenheit() {
        assertEquals(68.0, App.celsiusAFahrenheit(20));
    }

    @Test
    void IdentificarClima() {
        assertTrue(App.esClimaFrio(10));
    }
}