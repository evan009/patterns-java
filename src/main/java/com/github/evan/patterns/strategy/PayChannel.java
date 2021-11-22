package com.github.evan.patterns.strategy;

/**
 * @desc: 订单支付渠道 定义策略
 * @author: evan
 * @date: 2021/11/22
 */
public interface PayChannel {

    /**
     * @desc: 二维码支付
     * @author: evan
     * @date: 2021/11/22
     */
    void qrcodePay(String reqParam);

    /**
     * 通道类型
     * 
     * @return
     */
    String channelType();

}
