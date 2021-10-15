package org.naic.step_definitions;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.naic.utilities.ConfigurationReader;
import java.util.List;

import static io.restassured.RestAssured.*;

public class APITest {
    String baseUrl = ConfigurationReader.getProperty("petStoreUrl");
   @Test
    public void APITest() {
       Response response = given().auth().oauth2("special-key").accept(ContentType.JSON)
               .when().get(baseUrl + "/v2/pet/findByStatus?status=available&status=available")
               .then().statusCode(200)
               .and().contentType(ContentType.JSON)
               .extract().response();
       JsonPath jsonPath = response.jsonPath();
       List<Object> list = jsonPath.getList("id");
       Assert.assertTrue(list.size()>1);
   }
}
