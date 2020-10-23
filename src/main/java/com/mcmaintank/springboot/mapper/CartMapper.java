package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
public interface CartMapper {

    @Select("select * from eshop_cart where user_id = #{userId} and deleted_logic = 0")
    List<Cart> selectCartById(@Param("userId")Long userId);

//    @Update("update eshop_user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
//            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
//    int updateUserById(User user);

    @Update("update eshop_cart set deleted_logic = 1 where cart_id = #{cartId}")
    int deleteCartById(@Param("userId")Long cartId);

    @Insert("insert into eshop_cart(product_id,user_id,cart_id,product_quantity,deleted_logic) " +
            "values(#{productId},#{userId},#{cartId},#{productQuantity},#{deletedLogic})")
    int insertCart(Cart cart);

    @Update("update eshop_user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
    int logicDelete(Long id);


}
