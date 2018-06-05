package cn.riverluoo.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: wangyang
 * @since: 下午9:31 2018/6/5
 */
@Component
public class Server {

    @JmsListener(destination = "aa")
    public void receive(String message) {
        System.out.println("收到的 message 是：" + message);
    }
}
