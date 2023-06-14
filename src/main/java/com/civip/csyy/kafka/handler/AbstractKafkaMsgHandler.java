package com.civip.csyy.kafka.handler;

/**
 * @author: create by wangshuaiyu
 * @date: 2023/6/14
 */
public abstract class AbstractKafkaMsgHandler {

    public abstract void handle(String msg);
}
