import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class Post_APPLICATION_FORM_URLENCODED {

	public static void main(String[] args) {
		
		// Proxy
		// System.setProperty("https.proxyHost", "");
		// System.setProperty("https.proxyPort", "");
		
		// Url
		final String baseUrl = "poner aqui dummy service";

		// headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("email", "first.last@example.com");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		// restTemplate
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.postForEntity(baseUrl, request, String.class);
		//ResponseEntity<String> response = restTemplate.exchange(baseUrl, HttpMethod.POST, request, String.class);

		System.out.println("response.getStatusCodeValue(): " + response.getStatusCodeValue());
		System.out.println("response.getBody(): " + response.getBody());
		
	}

}
