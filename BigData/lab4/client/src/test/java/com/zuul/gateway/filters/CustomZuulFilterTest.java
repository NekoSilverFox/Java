package com.zuul.gateway.filters;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomZuulFilterTest {
    @Test
    public void whenSendRequestToFooResource_thenOK() {
        final Response response = RestAssured.get("http://localhost:8080/data/1");
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void whenSendRequest_thenHeaderAdded() {
        final Response response = RestAssured.get("http://localhost:8080/data/1");
        assertEquals(200, response.getStatusCode());
        assertEquals("TestSample", response.getHeader("Test"));
    }
}