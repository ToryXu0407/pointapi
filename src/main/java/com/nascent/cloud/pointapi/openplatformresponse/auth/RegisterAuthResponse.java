package com.nascent.cloud.pointapi.openplatformresponse.auth;

import com.nascent.cloud.pointapi.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:9:19
 * 注册授权接口
 */
@Getter
@Setter
public class RegisterAuthResponse extends BaseResponse {

   /**
    * 令牌
    */
   private String openAccessToken;
}
