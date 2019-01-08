package com.riverluoo.test;


import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;
import java.util.Map;

/**
 * @author wangyang
 * @since 2018-12-20 10:10
 */
public class GpsTest {


    public static void main(String[] args) {
        OkHttpClient okHttpClient=new OkHttpClient();
        final Base64.Decoder decoder = Base64.getDecoder();

        String url="http://api.map.baidu.com/ag/coord/convert?from=0&to=4&x=113.540124&y=23.517846";

        Request request = new Request.Builder().get().url(url).build();
        Response res;

        {
            try {
                res = okHttpClient.newCall(request).execute();
                Map<String, String> resJson = JSON.<Map<String, String>>parseObject(res.body().string(), Map.class);

                String x = resJson.get("x");
                String y = resJson.get("y");

                System.out.println(new String(decoder.decode(x), "utf-8"));
                System.out.println(new String(decoder.decode(y), "utf-8"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



}
