package com.nascent.cloud.pointapi.openplatformresponse.coupon;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.coupon.CouponResultInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:17:05
 * 查询批量发放优惠券结果集
 */
@Setter
@Getter
public class GetCouponResultListResponse extends BaseResponse {

    /**
     * 结果集
     */
    private List<CouponResultInfo> couponResultInfo;

    /**
     * 发放失败数
     */
    private Long failCount;

    /**
     * 发放成功数
     */
    private Long successCount;

    /**
     * 总发放数
     */
    private Long totalCount;

}
