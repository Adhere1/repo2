package com.itcast.pojo;

import com.itcast.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Orders {
    private String id;
    private String orderNum;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date orderTime;
    private String orderTimeStr;
    private int orderStatus;
    private int peopleCount;
    private Product product;
    private List<Traveller> travellers;
    private Member member;
    private Integer payType;
    private String payTypeStr;
    private String orderDesc;
    private String orderStatusStr;

    public String getOrderTimeStr(){
        if (orderTime!=null){
            orderTimeStr= DateUtils.dateToString(orderTime,"yyyy-MM-dd HH:mm:ss");
        }
        return orderTimeStr;
    }

    public String getPayTypeStr() {
        if (payType==0){
            payTypeStr="支付宝";
        }
        if (payType==1){
            payTypeStr="微信";
        }
        if (payType==2){
            payTypeStr="其他";
        }
        return payTypeStr;
    }

    public String getOrderStatus() {
        if (orderStatus==0){
            orderStatusStr="关闭";
        }
        if (orderStatus==1){
            orderStatusStr="开启";
        }
        return orderStatusStr;
    }
}
