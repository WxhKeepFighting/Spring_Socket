package com.wxh.NewServer.Server;

import com.wxh.NewServer.DAO.ServiceRepository;
import com.wxh.NewServer.DAO.User_SystemRepository;
import com.wxh.NewServer.Entity.Service;
import com.wxh.NewServer.Entity.User_system;
import com.wxh.NewServer.Service.FWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Optional;

@Component
public class NewSpecialService implements Runnable {

    @Autowired
    private User_SystemRepository u_repository;
    @Autowired
    private ServiceRepository s_repository;
    @Autowired
    private FWService fwService;
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public NewSpecialService() {
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        String content = "";
        try {
            createStream();//后续操作都不用在创建流
            content = dataInputStream.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("客户端发送消息为" + content);
        String message[] = content.split(",");
        String id = message[0];
        System.out.println("执行的操作为" + id);
        switch (id) {
            case "登录验证":
                User_system user_system = new User_system();
                user_system.setUsername(message[1]);
                user_system.setPassword(message[2]);
                loginVerification(user_system);
                break;
            case "开始服务":
                Service service = new Service();
                service.setId(message[1]);
                service.setStatus(message[2]);
                service.setStime(message[3]);
                service.setSpic(message[4]);
                startService(service);
                break;
            case "结束服务":
                service = new Service();
                service.setId(message[1]);
                service.setStatus(message[2]);
                service.setEtime(message[3]);
                service.setEpic(message[4]);
                endService(service);
                break;
        }
    }

    private void loginVerification(User_system user_system) {
        String s_id = user_system.getUsername();
        String s_password = user_system.getPassword();
        if (u_repository == null) {
            System.out.println("空空空");
        } else {
            Optional<User_system> byId = u_repository.findById(s_id);
            boolean flag = byId.isPresent();
            if (flag) {
                s_password.equals(byId.get().getPassword());
                try {
                    dataOutputStream.writeUTF("success");
                    close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    dataOutputStream.writeUTF("fail");
                    close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //开始服务
    private void startService(Service service) {
        try {
            if (service.getId().equals("0")) {
                dataOutputStream.writeUTF("发送的信息为空，操作失败");
                System.out.println("保存对象为空，保存失败");
            } else {
                Service save = s_repository.save(service);
                if (!save.getId().equals("")) {
                    dataOutputStream.writeUTF("任务号" + service.getId() + "保存成功");
                    close();
                    System.out.println("开始服务操作成功");
                } else {
                    System.out.println("信息插入失败");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //结束服务
    private void endService(Service service) {
        try {
            if (service.getId().equals("")) {
                dataOutputStream.writeUTF("发送的信息为空，操作失败");
                System.out.println("保存对象为空，保存失败");
            } else {
                int n = 1;
                fwService.endService(service);
                if (n > 0) {
                    dataOutputStream.writeUTF("任务号" + service.getId() + "保存成功");
                    close();
                    System.out.println("结束服务操作成功");
                } else {
                    System.out.println("结束服务失败");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //创建流
    private void createStream() throws IOException {
        //获取客户端的输入输出流
        dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream = new DataOutputStream(socket.getOutputStream());
    }

    //关闭流和socket
    private void close() throws IOException {
        if (dataInputStream != null) {
            dataOutputStream.close();
        }
        if (dataOutputStream != null) {
            dataInputStream.close();
        }
        if (socket != null) {
            socket.close();
        }
    }
}
