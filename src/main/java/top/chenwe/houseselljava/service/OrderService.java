package top.chenwe.houseselljava.service;


import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.annotations.Param;
import top.chenwe.houseselljava.domain.Order;
import top.chenwe.houseselljava.utils.Result.Result;

import javax.validation.Valid;
import java.util.List;

public interface OrderService {

    Result saveOrder(Order order);

    Result updateOrder(Order order);

    Result deleteOrder(int id);

    Result getUserOrderByUserId(int id);

    Result getAll();

    Result getUserOrderByUserName(String name);

}
