package com.lmj.test.oauthserver;

import com.lmj.test.oauthserver.dao.TbPermissionDao;
import com.lmj.test.oauthserver.dao.TbUserDao;
import com.lmj.test.oauthserver.entity.TbPermission;
import com.lmj.test.oauthserver.entity.TbUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class OauthServerApplicationTests {

    @Test
    void contextLoads() {
    }



    @Test
    public void test1() {
        System.out.println(new BCryptPasswordEncoder().encode("admin888"));
    }

    @Autowired
    private TbUserDao tbUserDao;

    @Test
    public void test2() {
        TbUser tbUser = new TbUser();
        tbUser.setUsername("admin");
        TbUser tbUser1 = tbUserDao.selectUserByUserName(tbUser);
        System.out.println(tbUser1);

    }

@Autowired
private TbPermissionDao tbPermissionDao;

    @Test
    public void test3() {
        TbUser tbUser = new TbUser();
        tbUser.setUserId(1L);

        List<TbPermission> tbPermissions = tbPermissionDao.selectPermissionByUserId(tbUser);
        for (TbPermission tbPermission : tbPermissions) {
            System.out.println(tbPermission);
        }
    }
}
