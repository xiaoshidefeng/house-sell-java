package top.chenwe.houseselljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chenwe.houseselljava.service.Impl.HouseServiceImpl;
import top.chenwe.houseselljava.utils.Result.Result;


@RestController
@RequestMapping("/api")
public class HouseController {

    @Autowired
    HouseServiceImpl houseService;

    @GetMapping("houselist")
    public Result getHouseList() {
        return houseService.getHouseList();
    }
}
