package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.Order;
import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Repository
//@Mapper
public interface OrderMapper {

    @Select("select * from eshop_order where user_id = #{userId} and deleted_logic = 0")
    List<Order> selectOrderByUserId(@Param("userId")Long userId);

//    @Update("update user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
//            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
//    int updateUserById(User user);

//    @Delete("delete from user where user_id = #{userId}")
//    int deleteUserById(Long id);

    @Insert("insert into eshop_order(order_id,user_id,product_id,product_quantity,order_number,create_date,product_price ) " +
            "values(#{orderId},#{userId},#{productId},#{productQuantity},#{orderNumber},#{createDate),#{productPrice)")
    int insertOrder(List<Order> order);

    @Select("select * from eshop_order ")
    void selectAllOrder();

    @Select("select max(order_id) from eshop_order")
    Long selectLatestOrderId();


}
