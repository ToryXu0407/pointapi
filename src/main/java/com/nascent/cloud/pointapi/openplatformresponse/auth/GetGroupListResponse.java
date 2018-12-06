package com.nascent.cloud.pointapi.openplatformresponse.auth;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.auth.GroupInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:9:45
 * 查询集团列表接口
 */
@Getter
@Setter
public class GetGroupListResponse extends BaseResponse {

    /**
     * 集团属性
     */
    private List<GroupInfo> groupInfos;

}
