package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author MCMainTank
 * @create 2020/10/11
 */
@Repository
//@Mapper
public interface CategoryMapper {

    @Select("select * from user where user_id = #{userId}")
    void selectUserById(@Param("userId")Long userId);

    @Update("update user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
    int updateUserById(User user);

    @Delete("delete from user where user_id = #{userId}")
    int deleteUserById(Long id);

    @Insert("insert into user(user_loginname,user_password,user_email,user_cellphone,user_autograph,user_balance) " +
            "values(#{userLoginname},#{userPassword},#{userEmail},#{userCellphone},#{userAutograph},#{userBalance})")
    int insertUser(User user);

    @Select("select * from user ")
    void selectAllUser();


}
