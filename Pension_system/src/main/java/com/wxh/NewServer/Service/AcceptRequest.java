package com.wxh.NewServer.Service;

import com.alibaba.fastjson.JSON;
import com.wxh.NewServer.Exception.AjaxResponse;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AcceptRequest {

    public String getUser(){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://192.168.43.73:8080/login?username=1&password=1")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String s = response.body().string();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
