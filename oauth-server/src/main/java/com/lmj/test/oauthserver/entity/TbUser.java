package com.lmj.test.oauthserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: TbUser
 * Description:
 * date: 2020/4/3 19:54
 *
 * @author MJ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser {

    private   Long userId;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Date created;
    private Date updated;
}
