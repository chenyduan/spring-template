package com.universeparticle.clientb.dubbo;

import com.universeparticle.dubbo.TestClientBDubbo;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService // (version = "1.0.0", group = "dev", timeout = 5000)
public class TestClientBDubboImpl implements TestClientBDubbo {
    @Override
    public String test() {
        System.out.println("***************这里是 B ");
        return "这里是B 的dubbo";
    }
}
