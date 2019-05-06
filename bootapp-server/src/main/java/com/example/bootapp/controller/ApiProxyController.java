package com.example.bootapp.controller;
import com.example.bootapp.service.ApiProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ApiProxy")
public class ApiProxyController {
    @Autowired
    private ApiProxyService apiProxyService;

    public ApiProxyController(ApiProxyService apiProxyService){
        this.apiProxyService=apiProxyService;
    }

    @RequestMapping(value = "", method= RequestMethod.GET)
    public String GetValue(@RequestParam("targetURL") String targetURL, @RequestParam MultiValueMap<String, String> allParams) {
        allParams.remove("targetURL");
        return apiProxyService.GetResponse(targetURL, allParams);
    }
    @RequestMapping(value = "", method= RequestMethod.POST)
    public String PostValue(@RequestParam("targetURL") String targetURL, @RequestParam MultiValueMap<String, String> allParams) {
        allParams.remove("targetURL");
        return apiProxyService.PostResponse(targetURL, allParams);
    }

}