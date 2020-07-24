package com.example.springcloud.definition;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author cheng
 * @Date 2020/7/24 15:06
 */
@Data
public class GatewayPredicateDefinition {
    private String name;
    private Map<String, String> args = new LinkedHashMap<>();
}
