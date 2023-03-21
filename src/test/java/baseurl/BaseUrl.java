package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseUrl {

    public static RequestSpecification spec;
    //If you use @Before annotation at the top of a method, it will be executed before every test method.

    public static void SetUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://commerceos.staging.devpayever.com/registration/").build();

    }
}
