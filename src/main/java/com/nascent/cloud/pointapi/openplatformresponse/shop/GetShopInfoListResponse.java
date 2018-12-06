package com.nascent.cloud.pointapi.openplatformresponse.shop;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.shop.ShopdetailedInfoVo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 查询店铺列表响应
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class GetShopInfoListResponse extends BaseResponse {

    //页码。从1开始，默认1
    private Integer pageNo;
    //页面大小，默认10
    private Integer pageSize;
    //开始数据，从0开始
    private String pageStart;
    //总数据数
    private String pageTotal;
    //结果集
    private List<ShopdetailedInfoVo> shopdetailedInfoVolist;
}
