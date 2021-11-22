package com.github.evan.patterns.strategy.impl;

import com.github.evan.patterns.strategy.PayChannelTypeEnum;
import com.github.evan.patterns.strategy.PayChannel;

/**
 * @desc: 通道下单银联商务实现类
 * @author: evan
 * @date: 2021/11/22
 */
public class ChinaUMSPayChannel implements PayChannel {

    @Override
    public void qrcodePay(String reqParam) {
        // 银联商务获取二维码
    }

    @Override
    public String channelType() {
        return PayChannelTypeEnum.CHINAUMS.name();
    }
}
