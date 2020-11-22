package com.i2f.test;

import com.i2f.model.Role;
import com.i2f.service.IRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
public class MainTest {
    @Autowired
    @Qualifier("roleService")
    private IRoleService roleSerice;

    @Autowired
    private JedisPool jedisPool;

    @Test
    public void doTest(){

        try{

            testRedis();

            showAllRole();

//            getRoleById();
//
//            findRoleByNameOrState();
//
//            findRoleByObject();
//
//            findAllIdsRole();
//
//            insertOneRole();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void testRedis() {
        Jedis resource = jedisPool.getResource();
        resource.set("testSSM","Hello SSM jedis");
        String str=resource.get("testSSM");
        System.out.println(str);
        resource.del("testSSM");
        resource.close();
    }

    private void insertOneRole() {
        Role roleInfo = new Role();
        roleInfo.setState(1);
        roleInfo.setNames("测试插入");
        roleInfo.setCreateTime(new Timestamp(new Date().getTime()));
        roleInfo.setDescInfo("测试描述");

        int rowCount = roleSerice.addRoleInfo(roleInfo);
        System.out.println(roleInfo);
        System.out.println(rowCount);
    }

    private void findAllIdsRole() {
        List<Integer> ids=new ArrayList<>();
        ids.add(100);
        ids.add(101);
        List<Role> list = roleSerice.getDataByIds(ids);
        for(Role item : list){
            System.out.println(item);
        }
    }

    private void findRoleByObject() {
        Role roleInfo = new Role();
        roleInfo.setNames("业");
        roleInfo.setState(1);
        List<Role> list = roleSerice.getData(roleInfo);
        for(Role item : list){
            System.out.println(item);
        }
    }

    private void findRoleByNameOrState() {
        List<Role> list = roleSerice.getDataByPara("业",null);
        for(Role item : list){
            System.out.println(item);
        }
    }

    private void getRoleById() {
        Role roleInfo = roleSerice.getById(1);
        if(roleInfo!=null){
            System.out.println(roleInfo);
        }
    }

    private void showAllRole() {
        List<Role> list = roleSerice.getAll();
        for(Role item : list){
            System.out.println(item);
        }
    }
}
