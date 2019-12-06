package com.wxh.NewServer.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/*
为什么不能用BufferedReader和BufferedWriter来写？？？？？害我调了那么久？
 * */
public class TCPClient02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        DataOutputStream ds = new DataOutputStream(socket.getOutputStream());
        String message = "开始服务,3,1,2019-12-25 11:08,1.jpg";
        ds.writeUTF(message);
        System.out.println("传的数据为"+message);
        DataInputStream di = new DataInputStream(socket.getInputStream());
        String answer = di.readUTF();
        System.out.println("服务器发来的消息"+answer);
    }
}
