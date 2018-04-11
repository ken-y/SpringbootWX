package com.ken.service;

import com.ken.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

public interface PayService {

    PayResponse create(OrderDTO  orderDTO);

    PayResponse notify(OrderDTO orderDTO);

    RefundResponse refund(OrderDTO orderDTO);
}
