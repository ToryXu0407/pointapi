package com.nascent.cloud.pointapi.openplatformresponse.trade;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.trade.FinishTradeListInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:29
 * 根据订单状态查询订单列表
 */
@Getter
@Setter
public class GetFinishTradeListResponse extends BaseResponse {

    /**
     * 订单列表
     */
    private List<FinishTradeListInfo> finishTradeListInfoList;
}
