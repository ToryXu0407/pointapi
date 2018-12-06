package com.nascent.cloud.pointapi.openplatformrequest.auth;

import com.nascent.cloud.pointapi.BaseRequest;
import com.nascent.cloud.pointapi.openplatform.OpenPlatformBaseRequest;
import com.nascent.cloud.pointapi.openplatformresponse.auth.GetBrandListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:11:47
 * 查询品牌列表接口
 */
@Getter
@Setter
public class GetBrandListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetBrandListResponse> {
    public String GetApiName() {
        return "/openApi/auth/getBrandList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetBrandListResponse> getResponseClass() {
        return GetBrandListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("groupId",this.getGroupId());
        return params;
    }

    /**
     * 集团ID
     */
    private Long groupId;

}
