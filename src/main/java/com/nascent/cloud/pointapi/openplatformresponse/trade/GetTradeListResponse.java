package com.nascent.cloud.pointapi.openplatformresponse.trade;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.trade.TradeListInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:13:58
 * 查询交易列表
 */
@Getter
@Setter
public class GetTradeListResponse extends BaseResponse {

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
     * 结果集
     */
    private List<TradeListInfo> result;

}
