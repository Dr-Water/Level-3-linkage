package com.ratel.link.controller;

import com.ratel.link.entity.City;
import com.ratel.link.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.link.controller
 * @project_name： Level-3-linkage
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-15 10:55
 * @copyright (c) ratelfu 版权所有
 */
@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("queryById")
    public List<City> queryById(Integer id){
        return cityService.queryById(id);
    }

}
