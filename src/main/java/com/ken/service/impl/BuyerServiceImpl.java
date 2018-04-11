package com.ken.service.impl;

import com.ken.dto.OrderDTO;
import com.ken.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService{

    @Autowired
    private OrderS

    @Override
    public OrderDTO findOrderOne(String openid, String orderid) {
        return null;
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderid) {
        return null;
    }
}
