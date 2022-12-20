package com.holyong.autogenerator.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: com.holyong.autogenerator.entity
 * @Author holyong
 * @CreateDate 2022-12-20
 * @describe 企业实体类
 */
@Data
@TableName("company_info")
@ApiModel(value="CompanyInfo对象", description="企业")
public class CompanyInfo extends Model<CompanyInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String smid;

    private String companyName;

    private String companyCode;

    private String companyAddress;

    private String companyPhone;

    private String companyCapital;

    private String companyPersonnel;

    private String companyCreatTime;

    private String legalRepresentative;

    private String businessStatus;

    private String administrativeDivision;

    private String paidCapital;

    private String companyType;

    private String companyIndustry;

    private String companyCommercecode;

    private String companyOrganizationcode;

    private String taxpayerCode;

    private String taxpayerAptitude;

    private String businessTerm;

    private String approvalDate;

    private String registrationAuthority;

    private String natureBusiness;

    private String companyDescribe;

    private String companyLogo;


}