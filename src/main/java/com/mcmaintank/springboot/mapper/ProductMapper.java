package com.mcmaintank.springboot.mapper;

import com.mcmaintank.springboot.model.Product;
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
public interface ProductMapper {

    @Select("select * from eshop_product where product_id = #{productId}")
    Product selectProductById(@Param("productId")Long productId);

    @Update("update eshop_product set product_id=#{productId},product_name=#{productName},category_id=#{categoryId}," +
            "product_price=#{productPrice},product_description=#{productDescription},product_imgpath=#{productImgpath}")
    int updateUserById(User user);

    @Delete("delete from eshop_product where product_id = #{productId}")
    int deleteProductById(Long id);

    @Insert("insert into eshop_product(product_id,product_name,category_id,product_price,product_description,product_imgpath) " +
            "values(#{productId},#{productName},#{categoryId},#{productPrice},#{productDescription},#{productImgpath})")
    int insertProduct(Product product);

    @Select("select * from eshop_product")
    List<Product> selectAllProduct();

    @Select("select * from eshop_product where product_name like #{productName}")
    List<Product> searchByName(@Param("productName")String productName);

    @Select("select product_imgpath from eshop_product where product_id = #{productId}")
    String selectProductImageById(@Param("productId")Long productId);

}
