package com.nascent.cloud.pointapi.openplatform;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:16:16
 */
@Getter
@Setter
public class OpenPlatformBaseRequest {


    /**
     * 店铺Id
     */
    Long GroupId;

    /**
     * 视角Id
     */
    Long BrandId;


    /**
     * 导购Id
     */
    private Long viewShopId;


    /**
     * accessToken
     */
    private String accessToken;

    /**
     * appKey
     */
    private String appKey;

    /**
     * serverUrl
     */
    private String serverUrl;


}
