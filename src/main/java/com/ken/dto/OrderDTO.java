package com.ken.dto;

import com.ken.dataobject.OrderDetail;
import com.ken.enums.OrderStatusEnum;
import com.ken.enums.PayStatusEnum;
import com.ken.utils.EnumUtil;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@lombok.Data
public class OrderDTO {

    /*订单Id*/
    private String orderId;

    /*买家姓名*/
    private String buyerName;
    /*买家手机号*/
    private String buyerPhone;
    /*买家地址*/
    private String buyerAddress;
    /*买家微信Openid*/
    private String buyerOpenid;
    /*订单总金额*/
    private BigDecimal orderAmount;
    /*订单状态，默认为0新下单*/
    private  Integer orderStatus;
    /*支付状态，默认为0未支付*/
    private Integer payStatus;

    /*创建时间*/
    private Data createTime;

    /*更新时间*/
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
