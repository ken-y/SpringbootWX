package com.ken.service;

import com.ken.dto.OrderDTO;

public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderid);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderid);
}
