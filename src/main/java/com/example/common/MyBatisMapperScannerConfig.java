package com.example.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by PVer on 2017/4/20.
 */
@Configuration
@MapperScan(basePackages = { "com.example.dao" }, sqlSessionFactoryRef = "sqlSessionFactory")
public class MyBatisMapperScannerConfig {
    protected static Log log = LogFactory.getLog(MyBatisMapperScannerConfig.class);

    public MyBatisMapperScannerConfig() {
        log.info("*************************MybatisScanConfiguration***********************");
    }
}
