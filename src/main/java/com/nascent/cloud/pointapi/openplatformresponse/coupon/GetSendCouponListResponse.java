package com.nascent.cloud.pointapi.openplatformresponse.coupon;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.coupon.CouponInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:9:01
 * 优惠券发放日志列表
 */
@Getter
@Setter
public class GetSendCouponListResponse extends BaseResponse {

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 页面大小
     */
    private Integer pageSize;

    /**
     * 开始数据的序号
     */
    private Integer pageStart;

    /**
     * 总数据数
     */
    private Integer pageTotal;

    /**
     * 总数据数
     */
    private List<CouponInfo> couponInfo;

}
