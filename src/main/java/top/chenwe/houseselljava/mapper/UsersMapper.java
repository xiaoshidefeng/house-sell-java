package top.chenwe.houseselljava.mapper;

import top.chenwe.houseselljava.domain.Users;

import java.util.List;

public interface UsersMapper {

    void save();

    void update();

    void delete();

    List<Users> findAll();
}
