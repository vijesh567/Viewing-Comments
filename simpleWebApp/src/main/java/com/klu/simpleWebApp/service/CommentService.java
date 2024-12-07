package com.klu.simpleWebApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CommentService {
    private final String API_URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Map<String, Object>> getAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        @SuppressWarnings("unchecked")
		Map<String, Object>[] response = restTemplate.getForObject(API_URL, Map[].class);
        return Arrays.asList(response);
    }
}