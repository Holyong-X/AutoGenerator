package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.DicGradeLevel;
import com.holyong.autogenerator.mapper.DicGradeLevelMapper;
import com.holyong.autogenerator.service.DicGradeLevelService;
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
public class DicGradeLevelServiceImpl extends ServiceImpl<DicGradeLevelMapper, DicGradeLevel> implements DicGradeLevelService {
}
