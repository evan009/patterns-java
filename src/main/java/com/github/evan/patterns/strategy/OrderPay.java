package com.github.evan.patterns.strategy;

import com.github.evan.patterns.strategy.impl.AliPayChannel;

/**
 * @desc: 订单支付  使用策略
 * @author: evan 
 * @date: 2021/11/22
 */ 
public class OrderPay {

    public static void main(String[] args) {
        memberOrderPay("");
    }


    private static void memberOrderPay(String reqParam){
        PayChannel payChannel = new AliPayChannel();
        payChannel.qrcodePay(reqParam);
    }


}
