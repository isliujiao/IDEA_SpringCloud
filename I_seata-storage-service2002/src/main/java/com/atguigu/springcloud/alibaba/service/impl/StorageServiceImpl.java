package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:厚积薄发
 * @create:2022-06-10-11:22
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
       log.info("------->storage-service中扣减库存开始");
       storageDao.decrease(productId,count);
       log.info("------->storage-service中扣减库存结束");
    }
}
