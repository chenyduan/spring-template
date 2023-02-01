package com.universeparticle.clienta.service;

import com.universeparticle.dubbo.TestClientBDubbo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @DubboReference //(version = "1.0.0", group = "dev", timeout = 5000)
    TestClientBDubbo testClientBDubbo;

    @Override
    public void test() {
        var res = "";
        res = testClientBDubbo.test();
        System.out.println("***********************远程结果是：");
        System.out.println(res);
    }

}
