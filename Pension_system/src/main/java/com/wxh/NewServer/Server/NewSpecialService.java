package com.wxh.NewServer.Server;

import com.wxh.NewServer.DAO.ServiceRepository;
import com.wxh.NewServer.DAO.User_SystemRepository;
import com.wxh.NewServer.Entity.Service;
import com.wxh.NewServer.Entity.User_system;
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
        if (id.equals("登录验证")) {
            String s_id = message[1];
            String s_password = message[2];
            User_system user_system = new User_system();
            user_system.setS_id(s_id);
            user_system.setS_password(s_password);
            loginVerification(user_system);
        }
        if (id.equals("开始服务")) {
            String mission_id = message[1];
            String service_status = message[2];
            String service_stime = message[3];
            String service_spic = message[4];
            Service service = new Service();
            service.setMission_id(mission_id);
            service.setService_status(service_status);
            service.setService_stime(service_stime);
            service.setService_spic(service_spic);
            startService(service);
        }
        if (id.equals("结束服务")) {
            String mission_id = message[1];
            String service_status = message[2];
            String service_etime = message[3];
            String service_epic = message[4];
            Service service = new Service();
            service.setMission_id(mission_id);
            service.setService_status(service_status);
            service.setService_etime(service_etime);
            service.setService_epic(service_epic);
            endService(service);
        }
    }

    private void loginVerification(User_system user_system) {
        String s_id = user_system.getS_id();
        String s_password = user_system.getS_password();
        if (u_repository == null) {
            System.out.println("空空空");
        } else {
            Optional<User_system> byId = u_repository.findById(s_id);
            boolean flag = byId.isPresent();
            if (flag) {
                s_password.equals(byId.get().getS_password());
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
            if (service.getMission_id().equals("0")) {
                dataOutputStream.writeUTF("发送的信息为空，操作失败");
                System.out.println("保存对象为空，保存失败");
            } else {
                s_repository.save(service);
                dataOutputStream.writeUTF("任务号" +service.getMission_id()+ "保存成功");
                close();
                System.out.println("开始服务操作成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //结束服务
    private void endService(Service service){
        try {
            if (service.getMission_id().equals("0")) {
                dataOutputStream.writeUTF("发送的信息为空，操作失败");
                System.out.println("保存对象为空，保存失败");
            } else {
                int n = s_repository.updateBymission_id(service.getService_status(), service.getService_etime(), service.getService_epic(), service.getMission_id());
                System.out.println(n);
                dataOutputStream.writeUTF("任务号" + service.getMission_id() + "保存成功");
                close();
                System.out.println("结束服务操作成功");
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
