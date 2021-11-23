package com.github.evan.patterns.strategy;

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
        PayChannel payChannel = PayChannelFactory.getPayChannel(PayChannelTypeEnum.ALI.name());
        payChannel.qrcodePay(reqParam);
    }


}
