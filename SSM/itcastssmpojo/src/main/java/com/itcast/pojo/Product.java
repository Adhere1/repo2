package com.itcast.pojo;

import com.itcast.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Product {
    private String id;//主键
    private String productNum;//产品编号
    private String productName;//产品名称
    private String cityName;//出发城市
    @DateTimeFormat(pattern = "yyyy-MM-d HH:mm:ss")
    private Date departureTime;//出发时间
    private String departureTimeStr;
    private double productPrice;//产品价格
    private String productDesc;//产品描述
    private Integer productStatus;//产品状态 0 关闭 1 开启
    private String productStatusStr;

    public String getProductStatusStr() {
        if (productStatus!=null){
            if (productStatus==1){
                productStatusStr="开启";
            }
            if (productStatus==0){
                productStatusStr="关闭";
            }
        }
        return productStatusStr;
    }



    public String getDepartureTimeStr(){
        if (departureTime!=null){
            departureTimeStr= DateUtils.dateToString(departureTime,"yyyy-MM-dd");
        }
        return departureTimeStr;
    }
}
