package com.nascent.cloud.pointapi.openplatformresponse.auth;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.auth.BrandInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:11:45
 * 查询品牌列表接口
 */
@Getter
@Setter
public class GetBrandListResponse extends BaseResponse {

    /**
     * 品牌属性
     */
    private List<BrandInfo> brandInfos;


}
