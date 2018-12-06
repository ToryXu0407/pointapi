package com.nascent.cloud.pointapi.openplatformresponse.coupon;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.coupon.CheckCouponInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:19:03
 * 查询小类优惠券是否可用
 */
@Getter
@Setter
public class CheckCouponCanUseResponse extends BaseResponse {
    /**
     * 优惠券是否可用
     */
    private CheckCouponInfo checkCouponInfo;
}
