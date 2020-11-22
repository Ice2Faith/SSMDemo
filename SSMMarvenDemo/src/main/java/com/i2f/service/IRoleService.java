package com.i2f.service;

import com.i2f.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAll();

    Role getById(int id);

    List<Role> getDataByPara(String roleName, Integer status);

    List<Role> getData(Role role);

    List<Role> getDataByIds(List<Integer> list);

    int addRoleInfo(Role role);
}
