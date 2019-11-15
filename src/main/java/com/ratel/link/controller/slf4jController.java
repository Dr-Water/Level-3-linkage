package com.ratel.link.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @业务描述：
 * @package_name： com.ratel.link.controller
 * @project_name： Level-3-linkage
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-15 15:13
 * @copyright (c) ratelfu 版权所有
 */
@RestController
@Slf4j
@RequestMapping("slf4j")
public class slf4jController {
    @GetMapping("test")
    public void testslf4j(String name){
        log.info(name+"，你好，这里是测试@Slf4j");

    }

}
