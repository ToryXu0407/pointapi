package com.nascent.cloud.pointapi.test.coupon;

import com.alibaba.fastjson.JSONObject;
import com.nascent.cloud.pointapi.ApiException;
import com.nascent.cloud.pointapi.openplatform.DefaultOpenPlatformClient;
import com.nascent.cloud.pointapi.openplatformrequest.coupon.SendFreSendCouponRequest;
import com.nascent.cloud.pointapi.openplatformresponse.coupon.SendFreSendCouponResponse;

import java.io.IOException;

public class SendFreSendCouponTest {
    public static void main(String [] args) throws IOException, ApiException {
        SendFreSendCouponRequest request = new SendFreSendCouponRequest();
        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        //设置其他需要的参数
        request.setCouponCode("2826111115118672");
        request.setCustomerId(2329428000313667L);
        System.out.println(request.GetParameters());
        Long start_time = System.currentTimeMillis();
        System.out.println(start_time);
        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
                request.getServerUrl(),request.getAppKey(),request.getAccessToken(),"733d7be2196ff70efaf6913fc8bdcabf"
        ,request.getGroupId(),request.getBrandId(),null);
        getResponse(request,defaultPointClient);
        Long end_time = System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("耗时:"+(end_time-start_time));
    }

    private static void getResponse(SendFreSendCouponRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            SendFreSendCouponResponse response = defaultPointClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
