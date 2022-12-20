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
 * @describe 实体类
 */
@Data
@TableName("householder")
@ApiModel(value="Householder对象", description="")
public class Householder extends Model<Householder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "householder_id", type = IdType.ASSIGN_ID)
    private String householderId;

    private String roomId;

    private String relation;

    private String name;

    private String certificateNumber;

    private String personnelType;

    private String sex;

    private String personnelBirthDate;

    private String age;

    private String registeredAddress;

    private String localPolicestation;

    private String englishSurname;

    private String englishName;

    private String nation;

    private String residentialAddress;

    private String codeId;

    private String hyModified;

    private String personnelLogo;

    private String personnelPhone;

    private String householdRegister;

    private String politicCountenance;

    private String graduatedFrom;

    private String educationalLevel;

    private String companyUnit;

    private String companyAddress;

    private String codeInformation;

    private String codeStatus;

    private String isolatedHome;

    private String transportationType;

    private String transportationCode;

    private String stopoverWay;


}