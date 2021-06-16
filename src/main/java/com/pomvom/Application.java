package com.pomvom;

import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Application implements BackgroundFunction<PubSubMessage> {

    @Override
    public void accept(PubSubMessage pubSubMessage, Context context) throws Exception {
        log.info("Received message ${}", pubSubMessage);
        log.info("Received context ${}", context);
    }
}

