package top.chenwe.houseselljava.controller;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.chenwe.houseselljava.domain.Order;
import top.chenwe.houseselljava.service.Impl.OrderServiceImpl;
import top.chenwe.houseselljava.utils.Result.Result;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    /**
     * 获取订单列表
     * @return
     */
    @GetMapping("/orders")
    public Result getOrderList() {
        return orderService.getAll();
    }

    /**
     * 获取用户订单
     * @param id
     * @return
     */
    @GetMapping("/user_orders/{id}")
    public Result getUserOrderByUserId(@PathVariable("id") int id) {
        return orderService.getUserOrderByUserId(id);
    }

    /**
     * 获取用户订单
     * @param name
     * @return
     */
    @PostMapping("/user_orders")
    public Result getUserOrderByUserName(@RequestParam("user_name") String name) {
        return orderService.getUserOrderByUserName(name);
    }

    @PostMapping("/rentHouse")
    public Result rentHouse(@Valid Order order) {
        return orderService.saveOrder(order);
    }

    @PostMapping("/payHouse")
    public Result payHouse(@Valid Order order) {
        return orderService.payHouse(order);
    }

    @PostMapping("/deleteOrder")
    public Result delOrder(@RequestParam("order_id") int id) {
        return orderService.deleteOrder(id);
    }

    @PostMapping("/updateOrder")
    public Result updateOrder(@Valid Order order) {
        return orderService.updateOrder(order);
    }

}
