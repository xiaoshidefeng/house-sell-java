package top.chenwe.houseselljava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.chenwe.houseselljava.domain.Order;
import top.chenwe.houseselljava.domain.Users;

import java.util.List;

@Mapper
public interface OrderMapper {

    void save(@Param("order") Order order);

    void update(@Param("orders") Order orders);

    void delete(@Param("id") int id);

    List<Users> findAll();

    List<Order> findOrderByUserId(@Param("user_id") int user_id);

    List<Order> findOrderByUserUserName(@Param("user_name") String user_name);

    Order findOrderByUserIdAndHouseId(@Param("user_id") int user_id, @Param("house_id") int house_id);

    void payOrderByUserIdAndHouseId(@Param("complete") Boolean complete, @Param("user_id") int user_id, @Param("house_id") int house_id);
}
