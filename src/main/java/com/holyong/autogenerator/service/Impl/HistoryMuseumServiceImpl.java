package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.HistoryMuseum;
import com.holyong.autogenerator.mapper.HistoryMuseumMapper;
import com.holyong.autogenerator.service.HistoryMuseumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 村使馆 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class HistoryMuseumServiceImpl extends ServiceImpl<HistoryMuseumMapper, HistoryMuseum> implements HistoryMuseumService {
}
