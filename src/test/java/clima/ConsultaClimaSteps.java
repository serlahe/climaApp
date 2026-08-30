package clima;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultaClimaSteps {

private String ciudadSeleccionada;
private String ciudadConsultada;

@Given("que el usuario selecciona la ciudad {string}")
public void seleccionarCiudad(String ciudad) {
    ciudadSeleccionada = ciudad;
}

@When("consulta la información climática")
public void consultarInformacionClimatica() {
    ciudadConsultada = ciudadSeleccionada;
}

@Then("se muestra la información climática de {string}")
public void verificarInformacionClimatica(String ciudadEsperada) {
    assertEquals(ciudadEsperada, ciudadConsultada);
}

}
