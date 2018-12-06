package com.nascent.cloud.pointapi.openplatformresponse.point;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.point.LogListInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:17:38
 * 用于积分查询日志接口响应
 */
@Getter
@Setter
public class GetIntegralLoglistResponse extends BaseResponse {

    /**
     * 日志信息列表
     */
    private List<LogListInfo> logListInfos;

    /**
     * 总条数
     */
    private Long total;
}
