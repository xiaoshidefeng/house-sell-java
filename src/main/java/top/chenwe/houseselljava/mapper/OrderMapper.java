package top.chenwe.houseselljava.mapper;

import top.chenwe.houseselljava.domain.Users;

import java.util.List;

public interface OrderMapper {

    void save();

    void update();

    void delete();

    List<Users> findAll();
}
