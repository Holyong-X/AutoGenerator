package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.TableMappiing;
import com.holyong.autogenerator.mapper.TableMappiingMapper;
import com.holyong.autogenerator.service.TableMappiingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 表名称映射关系表 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TableMappiingServiceImpl extends ServiceImpl<TableMappiingMapper, TableMappiing> implements TableMappiingService {
}
