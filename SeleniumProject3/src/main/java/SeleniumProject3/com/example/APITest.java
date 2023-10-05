package SeleniumProject3.com.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class APITest {

    @DataProvider(name = "translations")
    public Object[][] translationsData() throws IOException {
        return ExcelReader.readTestData("path/to/your/excel/file.xlsx", "Sheet1");
    }

    @Test(dataProvider = "translations")
    public void testTranslations(String translation) {
        RestAssured.baseURI = "https://restcountries.com/v3.1/translation/";
        Response response = RestAssured.get(translation);

        // Perform assertions on the response as needed
        // Example: response.then().statusCode(200);

        System.out.println("Response for translation '" + translation + "':");
        System.out.println(response.getBody().asString());
    }
}
