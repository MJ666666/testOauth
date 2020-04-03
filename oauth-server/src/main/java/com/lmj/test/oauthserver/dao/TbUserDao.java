package com.lmj.test.oauthserver.dao;

import com.lmj.test.oauthserver.entity.TbUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * ClassName: TbUserDao
 * Description:
 * date: 2020/4/3 19:51
 *
 * @author MJ
 */
@Repository
public interface TbUserDao {


    @Select("select * from tb_user where username=#{username}")
    @Results({@Result(property = "userId",column = "id"),@Result(property = "email",column = "email",jdbcType = JdbcType.VARCHAR)})
    TbUser selectUserByUserName(TbUser user);
}
