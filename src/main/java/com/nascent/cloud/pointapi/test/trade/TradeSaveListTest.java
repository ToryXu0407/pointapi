package com.nascent.cloud.pointapi.test.trade;

import com.alibaba.fastjson.JSONObject;
import com.nascent.cloud.pointapi.ApiException;
import com.nascent.cloud.pointapi.openplatform.DefaultOpenPlatformClient;
import com.nascent.cloud.pointapi.openplatformdomain.trade.TradeInfo;
import com.nascent.cloud.pointapi.openplatformrequest.trade.TradeSaveListRequest;
import com.nascent.cloud.pointapi.openplatformresponse.trade.TradeSaveListResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TradeSaveListTest {
    public static void main(String [] args) throws IOException, ApiException {
        TradeSaveListRequest request = new TradeSaveListRequest();
        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");

        //设置其他需要的参数
        List<TradeInfo> tradeInfoList = new ArrayList<>();
        TradeInfo tradeInfo = new TradeInfo();
        tradeInfo.setOutNick("~iDbFEyKcwX5B82G2WZbfOg==~1~");
        tradeInfo.setOutTradeId("236502340739626376");
        tradeInfoList.add(tradeInfo);
        request.setTradeInfos(tradeInfoList);

        System.out.println(request.GetParameters());
        Long start_time = System.currentTimeMillis();
        System.out.println(start_time);
        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
                request.getServerUrl(),request.getAppKey(),request.getAccessToken(),
                "733d7be2196ff70efaf6913fc8bdcabf",true,
                request.getGroupId(),request.getBrandId(), null);
        getResponse(request,defaultPointClient);
        Long end_time = System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("耗时:"+(end_time-start_time));
    }

    private static void getResponse(TradeSaveListRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            TradeSaveListResponse response = defaultPointClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
