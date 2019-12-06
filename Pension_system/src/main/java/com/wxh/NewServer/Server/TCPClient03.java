package com.wxh.NewServer.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        DataOutputStream ds = new DataOutputStream(socket.getOutputStream());
        String message = "结束服务,3,2,2019-12-6 11:09,2.jpg";
        ds.writeUTF(message);
        System.out.println("传的数据为"+message);
        DataInputStream di = new DataInputStream(socket.getInputStream());
        String answer = di.readUTF();
        System.out.println("服务器发来的消息"+answer);
    }
}
