package com.nascent.cloud.pointapi.openplatformresponse.customer;

import com.nascent.cloud.pointapi.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:19
 * 会员绑定/解绑接口
 */
@Getter
@Setter
public class BindCustomerResponse extends BaseResponse {

    /**
     * 会员卡号
     */
    private String memberCard;

}
