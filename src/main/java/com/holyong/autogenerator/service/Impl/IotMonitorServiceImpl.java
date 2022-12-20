package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.IotMonitor;
import com.holyong.autogenerator.mapper.IotMonitorMapper;
import com.holyong.autogenerator.service.IotMonitorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 物联网监控 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IotMonitorServiceImpl extends ServiceImpl<IotMonitorMapper, IotMonitor> implements IotMonitorService {
}
