package top.chenwe.houseselljava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.chenwe.houseselljava.domain.Users;
import top.chenwe.houseselljava.mapper.UsersMapper;
import top.chenwe.houseselljava.service.UsersService;
import top.chenwe.houseselljava.utils.CodeUtil;
import top.chenwe.houseselljava.utils.Enums.ResultEnums;
import top.chenwe.houseselljava.utils.IsNull;
import top.chenwe.houseselljava.utils.Result.Result;
import top.chenwe.houseselljava.utils.Result.ResultUtil;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Result login(Users users) {
        Boolean inputNull = users == null || IsNull.isNullField(users.getUser_name(), users.getPassword());
        if (inputNull) {
            return ResultUtil.error(ResultEnums.INPUT_NULL);
        }
        Users user = usersMapper.login(users.getUser_name(), CodeUtil.generateCode(users.getPassword()));

        if (user == null) {
            return ResultUtil.error(ResultEnums.CONFIRM_ERROR);
        }
        String token = CodeUtil.generateToken(user.getUser_name());
        user.setToken(token);
        usersMapper.saveToken(token, user.getUser_id());
        return ResultUtil.success(token);
    }

    @Override
    public Result register(Users users) {
        if (IsNull.isNullField(users.getUser_name(), users.getPassword())) {
            return ResultUtil.error(ResultEnums.INPUT_NULL);
        }
        Users oldUser = usersMapper.findByUserName(users.getUser_name());
        if (oldUser != null) {
            return ResultUtil.error(ResultEnums.NAME_IS_REGISTE);
        }
        String password = CodeUtil.generateCode(users.getPassword());
        users.setPassword(password);
        users.setAdmin(false);
        usersMapper.save(users);
        return ResultUtil.success();
    }



}
