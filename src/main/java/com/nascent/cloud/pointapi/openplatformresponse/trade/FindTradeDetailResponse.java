package com.nascent.cloud.pointapi.openplatformresponse.trade;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.trade.TradeDetail;
import com.nascent.cloud.pointapi.openplatformdomain.trade.TradeDetailList;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:14:46
 * 查询交易详情
 */
@Setter
@Getter
public class FindTradeDetailResponse extends BaseResponse {

    /**
     * 订单详情
     */
    private TradeDetail tradeDetail;

    /**
     * 子订单列表
     */
    private List<TradeDetailList> tradeDetailListList;
}
