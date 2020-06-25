package com.gxuwz.lab_assistant.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MapperScannerConfig
 * @Description TODO
 * @Author lisonglin
 * @Date 2019/3/27 22:43
 * @Version 1.0
 */
@Configuration
public class MapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //指定xml配置文件的路径
        mapperScannerConfigurer.setBasePackage("com.gxuwz.lab_assistant.web.mapper");
        return mapperScannerConfigurer;
    }

}
