package DataFileReader;
import org.testng.annotations.DataProvider;

public class ClassDataProvider {
    @DataProvider(name = "remoteDataProvider")
    public Object[][] queriesTestData() {
        Object[][] testDataArray = {
                {"JavaStart", "JavaStart - Szukaj w Google"},
                {"Selenium", "Selenium - Szukaj w Google"},
                {"TestNG", "TestNG - Szukaj w Google"}};
        return testDataArray;
    }

}

