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
 * @describe 表名称映射关系表实体类
 */
@Data
@TableName("table_mappiing")
@ApiModel(value="TableMappiing对象", description="表名称映射关系表")
public class TableMappiing extends Model<TableMappiing> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String udpName;

    private String sqlName;

    private String chineseName;


}