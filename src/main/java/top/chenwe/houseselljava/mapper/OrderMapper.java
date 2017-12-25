package top.chenwe.houseselljava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.chenwe.houseselljava.domain.Order;
import top.chenwe.houseselljava.domain.Users;

import java.util.List;

@Mapper
public interface OrderMapper {

    void save(@Param("order") Order order);

    void update();

    void delete(@Param("id") int id);

    List<Users> findAll();

    List<Order> findOrderByUserId(@Param("user_id") int user_id);

    List<Order> findOrderByUserUserName(@Param("user_name") String user_name);
}
