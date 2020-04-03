package com.lmj.test.oauthserver.dao;

import com.lmj.test.oauthserver.entity.TbPermission;
import com.lmj.test.oauthserver.entity.TbUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: TbPermissionDao
 * Description:
 * date: 2020/4/3 20:22
 *
 * @author MJ
 */
@Repository
public interface TbPermissionDao {

    @Select("SELECT p.* FROM tb_user AS u\n" +
            "LEFT JOIN tb_user_role AS ur\n" +
            "ON u.id = ur.user_id\n" +
            "LEFT JOIN tb_role AS r\n" +
            "ON r.id=ur.role_id\n" +
            "LEFT JOIN tb_role_permission AS\n" +
            "rp ON r.id = rp.role_id\n" +
            "LEFT JOIN tb_permission AS p\n" +
            "ON p.id = rp.permission_id\n" +
            "WHERE u.id=#{userId}")
    @Results(@Result(column = "id",property = "permissionId"))
    List<TbPermission> selectPermissionByUserId(TbUser tbUser);
}
