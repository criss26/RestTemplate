import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Post {

	public static void main(String[] args) {
		// Proxy
		// System.setProperty("https.proxyHost", "");
		// System.setProperty("https.proxyPort", "");

		// Url
		final String baseUrl = "http://dummy.restapiexample.com/api/v1/create";

		// headers
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, "application/json");

		// body
		String body = "{\"name\":\"criss\",\"salary\":\"123\",\"age\":\"23\"}";
		
		// Request con body + headers
		HttpEntity<String> requestEntity = new HttpEntity<>(body,headers);

		// restTemplate
		RestTemplate restTemplate = new RestTemplate();

		// execute GET
		ResponseEntity<String> result = restTemplate.exchange(baseUrl, HttpMethod.POST, requestEntity, String.class);

		System.out.println("result.getStatusCodeValue(): " + result.getStatusCodeValue());
		System.out.println("result.getBody(): " + result.getBody());

	}

}
