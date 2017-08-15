package com.android.honghongweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/15.
 * 存放县的信息
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;  //县所对应天气的id
    private int cityId;        //当前县所属城市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
