package com.softserveinc.protomath;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

//Integration tests
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDefaultGreeting() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello",
                String.class)).contains("Hello World!");
    }
    
    @Test
    public void testDefaultSquare() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/square",
                String.class)).containsPattern("The square of 0[\\.,]000000 is 0[\\.,]000000");
    }
    
    @Test
    public void testDefaultCube() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cube",
                String.class)).containsPattern("The cube of 0[\\.,]000000 is 0[\\.,]000000");
    }
    
    @Test
    public void testNonDefaultSquare() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/square?number=3",
                String.class)).containsPattern("The square of 3[\\.,]000000 is 9[\\.,]000000");
    }
    
    @Test
    public void testNonDefaultCube() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cube?number=3",
                String.class)).containsPattern("The cube of 3[\\.,]000000 is 27[\\.,]000000");
    }
}
