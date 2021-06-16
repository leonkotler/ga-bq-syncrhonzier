package com.pomvom;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ApplicationLocal implements HttpFunction {

    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
        var writer = httpResponse.getWriter();
        writer.write(PubSubMessage.builder().messageId("Hello").build().toString());
        log.info(PubSubMessage.builder().messageId("Hello").build().toString());
    }
}
