package runners;

//feature

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/report-html","json:target/report.json"},
        monochrome = true,
        snippets =  SnippetType.CAMELCASE,
        dryRun = false,
        strict = true, // o resultado geral falha se há skipped test
        // tags = "@test",
        // tags = "~@ignore",
        // tags = {"@tipo1", "@tipo2"} - AND
        // tags = {"@tipo1, @tipo2"} - OR
        features = "./src/test/java/features", // pode ser tambem o caminho da classe. O recomendável é manter a nível de pacote
        glue = "stepDefinition") // ambos arquivos e pacotes que se encontram feature e step definition devem estar sob o mesmo pai
                                // é possível, assim como no caso do arquivo features, informar o pacote
public class TestRunner {

}
