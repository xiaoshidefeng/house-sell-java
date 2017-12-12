package top.chenwe.houseselljava.domain;

public class House {

    private int house_id;

    private String house_name;

    private int user_id;

    private float house_prices;

    private Boolean house_sell;

    private String house_address;

    private String house_size;

    private String house_desc;

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public String getHouse_name() {
        return house_name;
    }

    public void setHouse_name(String house_name) {
        this.house_name = house_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public float getHouse_prices() {
        return house_prices;
    }

    public void setHouse_prices(float house_prices) {
        this.house_prices = house_prices;
    }

    public Boolean getHouse_sell() {
        return house_sell;
    }

    public void setHouse_sell(Boolean house_sell) {
        this.house_sell = house_sell;
    }

    public String getHouse_address() {
        return house_address;
    }

    public void setHouse_address(String house_address) {
        this.house_address = house_address;
    }

    public String getHouse_size() {
        return house_size;
    }

    public void setHouse_size(String house_size) {
        this.house_size = house_size;
    }

    public String getHouse_desc() {
        return house_desc;
    }

    public void setHouse_desc(String house_desc) {
        this.house_desc = house_desc;
    }
}
