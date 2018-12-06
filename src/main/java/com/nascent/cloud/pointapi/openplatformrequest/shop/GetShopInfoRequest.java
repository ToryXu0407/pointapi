package com.nascent.cloud.pointapi.openplatformrequest.shop;

import com.nascent.cloud.pointapi.BaseRequest;
import com.nascent.cloud.pointapi.Constants;
import com.nascent.cloud.pointapi.openplatform.OpenPlatformBaseRequest;
import com.nascent.cloud.pointapi.openplatformresponse.shop.GetShopInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询单个店铺详情请求
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class GetShopInfoRequest extends OpenPlatformBaseRequest implements BaseRequest<GetShopInfoResponse> {

    /**
     * 第三方网点编码
     */
    private String outSid;

    /**
     * 内部店铺Id
     */
    private Long shopId;

    public String GetApiName() {
        return "/openApi/shopQuery/getShopInfo";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<GetShopInfoResponse> getResponseClass() {
        return GetShopInfoResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("outSid",this.getOutSid());
        params.put("shopId",this.getShopId());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }

}
