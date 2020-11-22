package com.i2f.service.impl;

import com.i2f.dao.RoleDao;
import com.i2f.model.Role;
import com.i2f.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 这个注解，
 * @Service("roleService")
 * 是必要的，因为需要这个注解进行扫描
 * 但是其中的ID值是可以没有的，当只有一个实现类的时候
 * 那就可以这样写：
 * @Service
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    /**
     * 使用注解
     * @Resource
     * 标记，则Spring将会自动根据Mapper.xml文件，进行自动的注入代理对象
     */
    @Resource
    private RoleDao roleDao;

    @Override
    public List<Role> getAll() {
        return roleDao.getAll();
    }

    @Override
    public Role getById(int id) {
        return roleDao.getById(id);
    }

    @Override
    public List<Role> getDataByPara(String roleName, Integer status) {
        return roleDao.getDataByPara(roleName,status);
    }

    @Override
    public List<Role> getData(Role role) {
        return roleDao.getData(role);
    }

    @Override
    public List<Role> getDataByIds(List<Integer> list) {
        return roleDao.getDataByIds(list);
    }

    @Override
    public int addRoleInfo(Role role) {
        return roleDao.addRoleInfo(role);
    }
}
