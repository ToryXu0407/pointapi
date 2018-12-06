package com.nascent.cloud.pointapi.openplatformresponse.shop;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.shop.OrderRecordVo;
import com.nascent.cloud.pointapi.openplatformdomain.shop.RecordShopVo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 查询单个店铺详情响应
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class GetShopInfoResponse extends BaseResponse {

    /**
     * 订单记录
     */
    private OrderRecordVo orderRecordVo;

    /**
     * 店铺信息列表
     */
    private List<RecordShopVo> recordShopVoList;

}
