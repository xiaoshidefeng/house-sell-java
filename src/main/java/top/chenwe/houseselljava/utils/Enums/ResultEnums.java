package top.chenwe.houseselljava.utils.Enums;

/**
 * User: asus
 * Date: 2017/12/12
 * Time: 15:17
 */
public enum ResultEnums {
    UNKONW_ERROR(-1, "未知错误"),
    CONFIRM_ERROR(0, "验证错误 "),
    NAME_IS_REGISTE(2, "用户名已被注册"),
    ILLEGAL_INPUT(8, "非法输入"),
    USER_NOT_EXIST(12, "用户不存在"),
    PASSWORD_ERROR(14, "密码错误"),
    INPUT_NULL(16, "输入为空"),
    NOT_FIND_DORM(18, "找不到相关房子"),
    NOT_LOGIN(20, "未登录"),
    LOGIN_INFO_FIND_FAIL(22, "登录信息查询失败"),
    NOT_CONFIRM_MAIL(26, "未验证邮箱"),
    FINDBACK_PASSWORD_FAIL(28, "找回密码失败"),
    HOUSE_SELLED(30, "房子未允许销售");


    private Integer code;

    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}