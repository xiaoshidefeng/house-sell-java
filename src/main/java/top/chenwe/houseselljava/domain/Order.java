package top.chenwe.houseselljava.domain;

public class Order {

    private int order_id;

    private int user_id;

    private int house_id;

    private String creat_time;

    private Boolean order_complete;

    private String house_name;

    private String user_name;

    public Order(int user_id, int house_id, String creat_time, Boolean order_complete, String house_name, String user_name) {
        this.user_id = user_id;
        this.house_id = house_id;
        this.creat_time = creat_time;
        this.order_complete = order_complete;
        this.house_name = house_name;
        this.user_name = user_name;
    }

    public Order() {
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public String getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(String creat_time) {
        this.creat_time = creat_time;
    }

    public Boolean getOrder_complete() {
        return order_complete;
    }

    public void setOrder_complete(Boolean order_complete) {
        this.order_complete = order_complete;
    }

    public String getHouse_name() {
        return house_name;
    }

    public void setHouse_name(String house_name) {
        this.house_name = house_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
