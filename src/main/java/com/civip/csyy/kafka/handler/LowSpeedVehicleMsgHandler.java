package com.civip.csyy.kafka.handler;

import com.civip.csyy.annotation.KafkaMsgHandler;
import com.civip.csyy.common.enums.MsgTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: create by wangshuaiyu
 * @date: 2023/6/14
 */
@Component
@KafkaMsgHandler(msgType = MsgTypeEnum.LOW_SPEED_VEHICLE, name = "低速作业车数据处理")
public class LowSpeedVehicleMsgHandler extends AbstractKafkaMsgHandler{

    private final static Logger logger = LoggerFactory.getLogger(LowSpeedVehicleMsgHandler.class);

    @Override
    public void handle(String msg) {
        logger.info("recv msg: {}", msg);
    }
}
