package com.wxh.NewServer;

import com.wxh.NewServer.Server.TCPServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(ServerApplication.class, args);
        TCPServer tcpServer = container.getBean(TCPServer.class);
        tcpServer.mainService();//启动服务器
    }

}
