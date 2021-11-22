package com.github.evan.patterns.strategy.impl;

import com.github.evan.patterns.strategy.PayChannelTypeEnum;
import com.github.evan.patterns.strategy.PayChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 通道下单支付宝实现类
 * @author: evan 
 * @date: 2021/11/22
 */
@Slf4j
public class AliPayChannel implements PayChannel {

    @Override
    public void qrcodePay(String reqParam) {
        log.info("ali qrcode pay");
        // 支付宝获取二维码
    }

    @Override
    public String channelType() {
        return PayChannelTypeEnum.ALI.name();
    }
}
