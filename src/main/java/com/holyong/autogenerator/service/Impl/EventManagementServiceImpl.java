package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.EventManagement;
import com.holyong.autogenerator.mapper.EventManagementMapper;
import com.holyong.autogenerator.service.EventManagementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 事件管理 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EventManagementServiceImpl extends ServiceImpl<EventManagementMapper, EventManagement> implements EventManagementService {
}
