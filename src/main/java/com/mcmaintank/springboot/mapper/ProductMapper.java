package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.Product;
import com.mcmaintank.springboot.model.User;
import org.apache.ibatis.annotations.*;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Mapper
public interface ProductMapper {

    @Select("select * from product where product_id = #{productId}")
    void selectProductById(@Param("productId")Long productId);

    @Update("update product set product_id=#{productId},product_name=#{productName},category_id=#{categoryId}," +
            "product_price=#{productPrice},product_description=#{productDescription},product_imgpath=#{productImgpath}")
    int updateUserById(User user);

    @Delete("delete from product where product_id = #{productId}")
    int deleteProductById(Long id);

    @Insert("insert into product(product_id,product_name,category_id,product_price,product_description,product_imgpath) " +
            "values(#{productId},#{productName},#{categoryId},#{productPrice},#{productDescription},#{productImgpath})")
    int insertProduct(Product product);

    @Select("select * from product")
    void selectAllProduct();


}
