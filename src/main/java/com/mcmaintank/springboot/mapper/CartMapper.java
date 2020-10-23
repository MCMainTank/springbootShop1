package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.Cart;
import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/18
 */
public interface CartMapper {

    @Select("select *,eshop_product.product_name,eshop_product.product_description,eshop_product.product_price from eshop_cart LEFT JOIN eshop_product ON " +
            "eshop_cart.product_id = eshop_product.product_id where eshop_cart.user_id = #{userId} and deleted_logic = 0")
    List<Map> selectCartById(@Param("userId")Long userId);

//    @Update("update eshop_user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
//            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
//    int updateUserById(User user);

    @Update("update eshop_cart set deleted_logic = 1 where cart_id = #{cartId}")
    int deleteCartById(@Param("cartId")Long cartId);

    @Insert("insert into eshop_cart(product_id,user_id,product_quantity,deleted_logic,deliver_address,product_color,product_warranty) " +
            "values(#{productId},#{userId},#{productQuantity},#{deletedLogic},#{deliverAddress},#{productColor},#{productWarranty})")
    int insertCart(Cart cart);

    @Update("update eshop_user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
    int logicDelete(Long id);


}
