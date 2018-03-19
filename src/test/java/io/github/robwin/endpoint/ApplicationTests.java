package io.github.robwin.endpoint;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldEchoHelloWorld() throws IOException {

        ResponseEntity<EndpointResponse> entity = restTemplate.getForEntity("/actuator/test/robert", EndpointResponse.class);

        assertThat(entity.getBody().getMessage()).isEqualTo("Hello robert");

    }

}
