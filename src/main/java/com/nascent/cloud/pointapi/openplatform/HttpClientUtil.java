package com.nascent.cloud.pointapi.openplatform;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/12/3
 * Time:16:41
 */

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

public class HttpClientUtil {

    private final static String CONTENT_TYPE_TEXT_JSON = "text/json";

    public static String postRequest(String url, Map<String, Object> param) throws ClientProtocolException, IOException{

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");

        String parameter = JSONObject.toJSON(param)+"";

        StringEntity se = new StringEntity(parameter);
        se.setContentType(CONTENT_TYPE_TEXT_JSON);
        httpPost.setEntity(se);

        CloseableHttpResponse response = client.execute(httpPost);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity, "UTF-8");

        return result;
    }

}