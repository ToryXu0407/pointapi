package com.nascent.cloud.pointapi.openplatformresponse.customer;

import com.nascent.cloud.pointapi.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:13:31
 * 会员保存更新接口
 */
@Getter
@Setter
public class SaveCustomerResponse extends BaseResponse {

    /**
     * ECRP客户ID
     */
    private Long customerId;


}
