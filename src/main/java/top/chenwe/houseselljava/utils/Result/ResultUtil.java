package top.chenwe.houseselljava.utils.Result;

import top.chenwe.houseselljava.utils.Enums.ResultEnums;

/**
 * User: asus
 * Date: 2017/12/12
 * Time: 15:21
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("success");
        result.setData(object);

        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(ResultEnums resultEnums) {
        Result result = new Result();
        result.setCode(resultEnums.getCode());
        result.setMsg(resultEnums.getMsg());

        return result;
    }
}
