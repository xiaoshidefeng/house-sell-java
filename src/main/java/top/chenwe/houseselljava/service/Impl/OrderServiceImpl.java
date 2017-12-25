package top.chenwe.houseselljava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.chenwe.houseselljava.domain.House;
import top.chenwe.houseselljava.domain.Order;
import top.chenwe.houseselljava.mapper.HouseMapper;
import top.chenwe.houseselljava.mapper.OrderMapper;
import top.chenwe.houseselljava.service.OrderService;
import top.chenwe.houseselljava.utils.Enums.ResultEnums;
import top.chenwe.houseselljava.utils.IsNull;
import top.chenwe.houseselljava.utils.Result.Result;
import top.chenwe.houseselljava.utils.Result.ResultUtil;
import top.chenwe.houseselljava.utils.TimeUtil;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public Result saveOrder(Order order) {
        if (order == null || IsNull.isNullField(order.getHouse_name(), order.getUser_name())) {
            return ResultUtil.error(ResultEnums.INPUT_NULL);
        }
        House house = houseMapper.findHouseByHouseId(order.getHouse_id());
        if (house.getHouse_sell()) {
            return ResultUtil.error(ResultEnums.HOUSE_SELLED);
        }
        order.setCreat_time(TimeUtil.getTime());
        order.setOrder_complete(false);
        orderMapper.save(order);

        house.setHouse_sell(true);
        houseMapper.update(house);
        return ResultUtil.success();
    }

    @Override
    public Result updateOrder(Order order) {
        return null;
    }

    @Override
    public Result deleteOrder(int id) {
        orderMapper.delete(id);
        return ResultUtil.success();
    }

    @Override
    public Result getUserOrderByUserId(int id) {
        return ResultUtil.success(orderMapper.findOrderByUserId(id));
    }


    @Override
    public Result getAll() {
        return ResultUtil.success(orderMapper.findAll());
    }

    @Override
    public Result getUserOrderByUserName(String name) {
        return ResultUtil.success(orderMapper.findOrderByUserUserName(name));
    }
}
