package com.nascent.cloud.pointapi.openplatformrequest.subdivision;

import com.nascent.cloud.pointapi.BaseRequest;
import com.nascent.cloud.pointapi.Constants;
import com.nascent.cloud.pointapi.openplatform.OpenPlatformBaseRequest;
import com.nascent.cloud.pointapi.openplatformresponse.subdivision.SelectSubdivisionListResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取某品牌下的分组列表请求
 * Created by Lijian on 2018/11/29.
 */
public class SelectSubdivisionListRequest extends OpenPlatformBaseRequest implements BaseRequest<SelectSubdivisionListResponse> {

    public String GetApiName() {
        return "/openApi/SubdivisionSelect/selectSubdivisionList";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<SelectSubdivisionListResponse> getResponseClass() {
        return SelectSubdivisionListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        return new HashMap<>();
    }
}
