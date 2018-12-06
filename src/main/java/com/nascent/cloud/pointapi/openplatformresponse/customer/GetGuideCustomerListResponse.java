package com.nascent.cloud.pointapi.openplatformresponse.customer;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.customer.CustomerInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:31
 * 获取专属导购id不为空的会员列表
 */
@Getter
@Setter
public class GetGuideCustomerListResponse extends BaseResponse {

    /**
     * 会员属性
     */
    private List<CustomerInfo> customerInfos;


}
