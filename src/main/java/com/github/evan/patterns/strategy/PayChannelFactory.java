package com.github.evan.patterns.strategy;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

import com.github.evan.patterns.strategy.impl.AliPayChannel;
import com.github.evan.patterns.strategy.impl.ChinaUMSPayChannel;
import com.github.evan.patterns.strategy.impl.WechatPayChannel;

/**
 * @desc: 订单通道工厂类
 * @author: evan
 * @date: 2021/11/22
 */
public class PayChannelFactory {

    private static HashMap<String, PayChannel> channelHashMap = new HashMap<>();

    static {
        channelHashMap.put(PayChannelTypeEnum.ALI.name(), new AliPayChannel());
        channelHashMap.put(PayChannelTypeEnum.WEECHAT.name(), new WechatPayChannel());
        channelHashMap.put(PayChannelTypeEnum.CHINAUMS.name(), new ChinaUMSPayChannel());
    }

    /**
     * @desc: 获取支付通道
     * @author: evan
     * @date: 2021/11/22
     */
    public static PayChannel getPayChannel(String type) {
        if (StringUtils.isBlank(type)) {
            return null;
        }
        return channelHashMap.get(type);
    }

}
