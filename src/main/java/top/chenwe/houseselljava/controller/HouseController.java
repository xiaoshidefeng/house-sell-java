package top.chenwe.houseselljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.chenwe.houseselljava.service.Impl.HouseServiceImpl;
import top.chenwe.houseselljava.utils.Result.Result;


@RestController
@RequestMapping("/api")
public class HouseController {

    @Autowired
    HouseServiceImpl houseService;

    /**
     * 获取房屋列表
     * @return
     */
    @GetMapping("/houselist")
    public Result getHouseList() {
        return houseService.getHouseList();
    }

    /**
     * 获取用户房屋列表
     * @param id
     * @return
     */
    @GetMapping("/userhouse/{id}")
    public Result getUserHouseList(@PathVariable("id") int id) {
        return houseService.findUserHouse(id);
    }


    /**
     * 通过模糊匹配房屋名称来获取房屋列表
     * @param name
     * @return
     */
    @PostMapping("/houses")
    public Result getHouseListLike(@RequestParam("name") String name) {
        return houseService.findByHouseName(name);
    }

    @GetMapping("/house/{id}")
    public Result getHouseInfo(@PathVariable("id") int id) {
        return houseService.findByHouseId(id);
    }
}
