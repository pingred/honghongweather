package com.android.honghongweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/15.
 * 存放省的数据信息
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;  //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
