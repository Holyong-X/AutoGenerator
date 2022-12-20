package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.GardenMonitor;
import com.holyong.autogenerator.mapper.GardenMonitorMapper;
import com.holyong.autogenerator.service.GardenMonitorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 菜园统计监控 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GardenMonitorServiceImpl extends ServiceImpl<GardenMonitorMapper, GardenMonitor> implements GardenMonitorService {
}
