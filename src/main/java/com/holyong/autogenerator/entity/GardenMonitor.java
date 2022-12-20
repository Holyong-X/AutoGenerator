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
 * @describe 菜园统计监控实体类
 */
@Data
@TableName("garden_monitor")
@ApiModel(value="GardenMonitor对象", description="菜园统计监控")
public class GardenMonitor extends Model<GardenMonitor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String gardenName;

    private String gardenAreaName;

    private String gardenMonitorLink;


}