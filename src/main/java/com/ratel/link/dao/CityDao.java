package com.ratel.link.dao;

import com.ratel.link.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.link.dao
 * @project_name： Level-3-linkage
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-15 11:27
 * @copyright (c) ratelfu 版权所有
 */
@Mapper
public interface CityDao {

     List<City> queryById(Integer id);

}
