package com.holyong.autogenerator.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
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
 * @describe 事件管理实体类
 */
@Data
@TableName("event_management")
@ApiModel(value="EventManagement对象", description="事件管理")
public class EventManagement extends Model<EventManagement> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String smid;

    private String eventName;

    private String occurrenceTime;

    private String uploader;

    private String telephone;

    private String eventType;

    private String eventPicture;

    private String eventContent;

    private String eventStatus;

    private String handleType;

    private String handleContent;

    private String auditResult;

      @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private String updateTime;

    private String coordinate;

    private String discoveryAddress;

    private String villageGroup;

    private String handleUploader;

    private String handlePicture;

    private String handleTime;

    private String handleEstimatetime;

    private String handleProgress;

    private String examinePicture;

    private String examineUploader;

    private String completeTime;

    private String completePicture;


}