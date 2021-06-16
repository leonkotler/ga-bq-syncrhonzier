package com.pomvom;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class PubSubMessage {
    private String data;
    private String messageId;
    private String publishTime;
    private Map<String, String> attributes;
}
