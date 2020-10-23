package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.Order;
import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Repository
//@Mapper
public interface OrderMapper {

    @Select("select eshop_order.*,eshop_product.product_name,eshop_product.product_description,eshop_product.product_price from eshop_order LEFT JOIN eshop_product ON " +
            "eshop_order.product_id = eshop_product.product_id where eshop_order.user_id = #{userId} and deleted_logic = 0")
    List<Map> selectOrderByUserId(@Param("userId")Long userId);

//    @Update("update user set user_loginname=#{userLoginname},user_password=#{userPassword},user_email=#{userEmail}," +
//            "user_cellphone=#{userCellphone},user_autograph=#{userAutograph},user_balance=#{userBalance}")
//    int updateUserById(User user);

//    @Delete("delete from user where user_id = #{userId}")
//    int deleteUserById(Long id);

    @Insert("insert into eshop_order(order_id,user_id,product_id,product_quantity,product_color,create_date,product_price,order_address,product_warranty,deleted_logic)" +
            "values(#{orderId},#{userId},#{productId},#{productQuantity},#{productColor},#{createDate},#{productPrice},#{orderAddress},#{productWarranty},#{deletedLogic}")
    int insertOrder(List<Order> order);

    @Insert("insert into eshop_order(user_id,product_id,product_quantity,product_color,create_date,order_address,product_warranty,deleted_logic) " +
            "values(#{userId},#{productId},#{productQuantity},#{productColor},#{createDate},#{orderAddress},#{productWarranty},#{deletedLogic})")
    int insertSingleOrder(Order order);

    @Select("select * from eshop_order ")
    void selectAllOrder();

    @Select("select max(order_id) from eshop_order")
    Long selectLatestOrderId();

    @Update("update eshop_order set deleted_logic = 1 where order_id = #{orderId}")
    int deleteOrderById(@Param("orderId")Long orderId);




}
