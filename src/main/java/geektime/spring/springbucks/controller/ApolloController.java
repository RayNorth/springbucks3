package geektime.spring.springbucks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApolloController {
    @Value("${apolloKey:none}")
    private String apolloKey;

    @GetMapping(value = "/apolloTest")
    @ResponseBody
    public String apolloTest() {
        log.info("this is key{apolloKey}:value{}",this.apolloKey);
        return this.apolloKey;
    }
}
