package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.DicGbnation;
import com.holyong.autogenerator.mapper.DicGbnationMapper;
import com.holyong.autogenerator.service.DicGbnationService;
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
public class DicGbnationServiceImpl extends ServiceImpl<DicGbnationMapper, DicGbnation> implements DicGbnationService {
}
