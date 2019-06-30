package practice.develop.blank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import practice.develop.blank.dto.SampleRequestBody;
import practice.develop.blank.dto.SampleResponseBody;

public class BlankApplication {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();

		SampleRequestBody req = new SampleRequestBody();
		req.setId("str");
		req.setPlusNum(5);

		// getの場合
		String getParam = restTemplate.getForObject("http://127.0.0.1:8080/get-server?stringParam=str", String.class);
		System.out.println("getParam : " + getParam);
		System.out.println("---------------------------------------------------------------------------");

		// postの場合
		String postUrl = "http://127.0.0.1:8080/post-server";
		ResponseEntity<SampleResponseBody> res = restTemplate.postForEntity(postUrl, req, SampleResponseBody.class);

		System.out.println("id : " + res.getBody().getId());
		System.out.println("num : " + res.getBody().getResultNum());

	}

}
