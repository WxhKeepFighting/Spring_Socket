package com.wxh.NewServer.Server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient01 {
    public static void main(String[] args){
        Socket socket = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            socket = new Socket("127.0.0.1", 8888);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String message = "登录验证,1,1";
            dataOutputStream.writeUTF(message);
            dataOutputStream.flush();
            String result = dataInputStream.readUTF();
            System.out.println("服务器发送" + result);
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
