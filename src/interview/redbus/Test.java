package interview.redbus;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("https://capipp.redbus.com/api/Config/v1/AllConfig");
        get.setHeader(HttpHeaders.ACCEPT, "application/json");
        get.setHeader("Channel_Name", "MOBILE_WEB");
        get.setHeader("BusinessUnit", "BUS");
        get.setHeader("Country_Name", "IND");
        HttpResponse response = client.execute(get);
        System.out.println("response: ");
        System.out.println(response.getStatusLine());
        String responseAsString = EntityUtils.toString(response.getEntity());
        System.out.println(responseAsString);
    }
}
