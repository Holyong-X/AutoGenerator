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
 * @describe 河道实体类
 */
@Data
@TableName("river")
@ApiModel(value="River对象", description="河道")
public class River extends Model<River> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "river_id", type = IdType.ASSIGN_ID)
    private String riverId;

    private String smid;

    private String riverName;

    private String riverLength;

    private String riverWaterLever;

    private String riverFlow;

    private String riverFlowto;

    private String riverPerson;

    private String riverPhone;

    private String riverCapacity;

    private String riverStandardname;

    private String riverLevel;

    private String riverCode;

    private String riverArea;

    private String riverBelevation;

    private String riverWidth;

    private String riverBwidth;

    private String riverWhether;

    private String riverVillage;

    private String riverCitycode;

    private String riverFlowvillage;

    private String riverStart;

    private String riverEnd;

    private String riverStreettown;

    private String riverTime;

    private String riverDescribe;


}