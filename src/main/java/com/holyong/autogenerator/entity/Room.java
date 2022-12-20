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
@TableName("room")
@ApiModel(value="Room对象", description="")
public class Room extends Model<Room> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "room_id", type = IdType.ASSIGN_ID)
    private String roomId;

    private String houseId;

    private String smid;

    private String roomNumber;

    private String roomType;

    private String roomOwner;

    private String ownerCertificate;

    private String ownerPhone;

    private String residents;

    private String registedResidents;

    private String over60;

    private String height;

    private String customFields;


}