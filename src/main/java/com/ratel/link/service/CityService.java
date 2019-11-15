package com.ratel.link.service;

import com.ratel.link.dao.CityDao;
import com.ratel.link.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.link.service
 * @project_name： Level-3-linkage
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-15 11:25
 * @copyright (c) ratelfu 版权所有
 */
@Service
public class CityService {
    @Autowired
    private CityDao cityDao;

    public List<City> queryById(Integer id) {
        return cityDao.queryById(id);
    }

}
