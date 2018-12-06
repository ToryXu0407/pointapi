package com.nascent.cloud.pointapi.openplatformresponse.property;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.property.PropertyInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:11:52
 * 获取自定义属性
 */
@Getter
@Setter
public class GetPropertyListResponse extends BaseResponse {

    /**
     * 属性列表
     */
    private List<PropertyInfo> propertyInfos;
}
