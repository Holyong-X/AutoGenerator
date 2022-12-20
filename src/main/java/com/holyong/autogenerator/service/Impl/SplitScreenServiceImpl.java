package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.SplitScreen;
import com.holyong.autogenerator.mapper.SplitScreenMapper;
import com.holyong.autogenerator.service.SplitScreenService;
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
public class SplitScreenServiceImpl extends ServiceImpl<SplitScreenMapper, SplitScreen> implements SplitScreenService {
}
