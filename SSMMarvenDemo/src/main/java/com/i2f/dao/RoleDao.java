package com.i2f.dao;

import com.i2f.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 这个注解
 * @Repository
 * 是可有可无的，因为一般你会配置你的dao接口的路径，而不是使用注解进行扫描
 * 另外，注解的值也是可以没有的
 * 也就是说不写和这样写也是可以的
 * @Repository
 */
@Repository("roleDao")
public interface RoleDao {
    /**
     * 获取所有角色
     * @return
     */
    List<Role> getAll();

    /**
     * 根据Id获取角色
     * @param id
     * @return
     */
    Role getById(@Param("id")int id);

    List<Role> getDataByPara(@Param("roleName")String roleName,
                             @Param("status")Integer status);

    List<Role> getData(Role role);

    List<Role> getDataByIds(List<Integer> list);

    int addRoleInfo(Role role);
}
