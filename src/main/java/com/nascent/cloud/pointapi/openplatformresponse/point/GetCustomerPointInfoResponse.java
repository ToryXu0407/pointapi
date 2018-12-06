package com.nascent.cloud.pointapi.openplatformresponse.point;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.point.PointInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:23
 * 用于查询积分接口响应
 */
@Getter
@Setter
public class GetCustomerPointInfoResponse extends BaseResponse {

    /**
     * 积分
     */
    private PointInfo point;

    /**
     * total
     */
    private Integer total;
}
