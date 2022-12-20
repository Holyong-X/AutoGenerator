package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.River;
import com.holyong.autogenerator.mapper.RiverMapper;
import com.holyong.autogenerator.service.RiverService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 河道 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RiverServiceImpl extends ServiceImpl<RiverMapper, River> implements RiverService {
}
