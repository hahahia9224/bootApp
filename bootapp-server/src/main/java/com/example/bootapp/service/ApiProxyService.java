package com.example.bootapp.service;
import com.example.bootapp.model.ApiProxyModel;
import com.example.bootapp.repository.ApiProxyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service
public class ApiProxyService {
   //@Autowired
    private final RestTemplate restTemplate;

    @Autowired
    private ApiProxyRepository apiProxyRepository;


    public ApiProxyService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }


    public String GetResponse(String targetURL, MultiValueMap<String, String> allParams){
        StringBuilder reqUrl = new StringBuilder(targetURL);
        reqUrl.append('?');
        allParams.forEach((key, vals) -> {
            vals.forEach(elem -> {
                reqUrl.append(String.format("&%s=%s",key,elem));
            });
        });
        String response = restTemplate.getForObject(reqUrl.toString(), String.class);
        return response.toString();
    }

    public String PostResponse(String targetURL, MultiValueMap<String, String> allParams){
        return "";
       // String response = restTemplate.postForObject(uri, String.class);
       //String response = restTemplate.getForObject(uri, String.class);
       // return response.toString();
    }

}
