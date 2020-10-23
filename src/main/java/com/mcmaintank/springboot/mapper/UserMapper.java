package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Repository
//@Mapper
public interface UserMapper {

    @Select("select * from eshop_user where user_id = #{userId}")
    User selectUserById(@Param("userId")Long userId);

    @Update("update eshop_user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance} where user_id=#{userId}")
    int updateUserById(User user);

    @Delete("delete from eshop_user where user_id = #{userId}")
    int deleteUserById(@Param("userId") Long userId);

    @Insert("insert into eshop_user(user_loginname,user_password,user_email,user_cellphone,user_address,user_balance) " +
            "values(#{userLoginname},#{userPassword},#{userEmail},#{userCellphone},#{userAddress},#{userBalance})")
    int insertUser(User user);

    @Select("select * from eshop_user ")
    List <User> selectAllUser();

    @Select("select user_password from eshop_user where user_loginname = #{userLoginname}")
    String getPassword(String userLoginname);

    @Select("select * from eshop_user where user_loginname = #{userName}")
    User selectUserByName(@Param("userName")String userName);

    @Update("update eshop_user set " +
            "user_balance=#{fund} where user_id=#{userId}")
    int updateUserFund(Long userId, BigDecimal fund);


}
