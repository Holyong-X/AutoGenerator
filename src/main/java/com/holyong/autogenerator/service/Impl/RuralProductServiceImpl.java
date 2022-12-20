package com.holyong.autogenerator.service.Impl;

import com.holyong.autogenerator.entity.RuralProduct;
import com.holyong.autogenerator.mapper.RuralProductMapper;
import com.holyong.autogenerator.service.RuralProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-12-20
 * @description 乡村产品 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RuralProductServiceImpl extends ServiceImpl<RuralProductMapper, RuralProduct> implements RuralProductService {
}
