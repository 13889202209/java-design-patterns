package com;

import com.github.kevinsawicki.http.HttpRequest;

public class Test {
    public static void main(String[] args) {
        String str = HttpRequest.post("http://59.252.100.160:8081/pe/model/getModel.do").contentType("application/json").send("{\"modelId\":\"2c90e4a3654730d201654fdbe4d00017\"}").body();
        System.out.println(str);


        String json = "{\"uuid\": \"be0f3908-ff44-4688-a8e2-6d445c16c0b5\",\"resultType\": \"select\",\"data\": [{\"voiceId\": \"17112001000040350\",\"modelId\": \"201711161130497601289\",\"handleTime\": \"2018-07-17 14:20:11\",\"count\": 1,\"speed\": \"5.473541\",\"sensitiveInfo\": [{\"isHit\": false,\"voiceId\": \"4.wav.xml\",\"modelId\": \"cl001\",\"handleTime\": \"2018-08-15 09:36:41\",\"count\": 0,\"seppd\": \"350\",\"sensitiveInfo\": [],\"silenceInfo\": []},{\"isHit\": true,\"voiceId\": \"16.wav.xml\",\"modelId\": \"cl001\",\"handleTime\": \"2018-08-15 09:36:41\",\"count\": 1,\"seppd\": \"343\",\"sensitiveInfo\": [{\"start\": 3090,\"end\": 4140,\"keyword\": \"有什么可以帮您\"}],\"silenceInfo\": []}]}]}";
        String s2 = HttpRequest.post("http://59.252.100.160:8081/pe/result/addResult.do").contentType("application/json").send(json).body();
        System.out.println(s2);




    }
}
