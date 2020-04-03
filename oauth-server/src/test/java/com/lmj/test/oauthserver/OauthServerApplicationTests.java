package com.lmj.test.oauthserver;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class OauthServerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void test1() {
        System.out.println(encoder.encode("secret"));
    }
}
