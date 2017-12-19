package top.chenwe.houseselljava.service;

import top.chenwe.houseselljava.domain.Users;
import top.chenwe.houseselljava.utils.Result.Result;

public interface UsersService {
    Result login(Users users);

    Result register(Users users);

}
