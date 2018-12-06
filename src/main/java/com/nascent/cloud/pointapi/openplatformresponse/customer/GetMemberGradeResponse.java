package com.nascent.cloud.pointapi.openplatformresponse.customer;

import com.nascent.cloud.pointapi.BaseResponse;
import com.nascent.cloud.pointapi.openplatformdomain.customer.BenefitList;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:18:56
 */
@Getter
@Setter
public class GetMemberGradeResponse extends BaseResponse {

    /**
     * benefitList
     */
    private List<BenefitList> benefitList;

    /**
     * 等级
     */
    private Integer grade;

    /**
     * 等级标识
     */
    private String gradeCode;

    /**
     * 等级名称
     */
    private String gradeName;

    /**
     * 是否可用
     */
    private Integer isAble;

    /**
     * 备注
     */
    private String remark;


}
