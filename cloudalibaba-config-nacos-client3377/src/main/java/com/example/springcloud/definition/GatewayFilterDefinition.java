package com.example.springcloud.definition;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author cheng
 * @Date 2020/7/24 15:05
 */
@Data
public class GatewayFilterDefinition {
    private String name;
    private Map<String, String> args = new LinkedHashMap<>();
}
