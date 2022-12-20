package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.Road;
import com.holyong.autogenerator.mapper.RoadMapper;
import com.holyong.autogenerator.service.RoadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description  服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoadServiceImpl extends ServiceImpl<RoadMapper, Road> implements RoadService {
}
