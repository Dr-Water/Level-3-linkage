package com.ratel.link.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @业务描述：
 * @package_name： com.ratel.link.entity
 * @project_name： Level-3-linkage
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-15 10:55
 * @copyright (c) ratelfu 版权所有
 */
@Component
public class City implements Serializable{
    private Integer id;
    private String name;
    private Integer pid;
    private String status;

    public City() {
    }

    public City(Integer id, String name, Integer pid, String status) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
