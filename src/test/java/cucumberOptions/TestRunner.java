package cucumberOptions;

//feature

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/features", // pode ser tambem o caminho da classe. O recomendável é manter a nível de pacote
        glue = "stepDefinition") // ambos arquivos e pacotes que se encontram feature e step definition devem estar sob o mesmo pai
                                // é possóvil, assim como no caso do arquivo features, informar o pacote
public class TestRunner {

}
