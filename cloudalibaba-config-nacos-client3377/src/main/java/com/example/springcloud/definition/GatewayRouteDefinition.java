package com.example.springcloud.definition;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cheng
 * @Date 2020/7/24 15:04
 */
@Data
public class GatewayRouteDefinition {
    private String id;
    
    private List<GatewayFilterDefinition> filters = new ArrayList<>();
    
    private List<GatewayPredicateDefinition> predicates = new ArrayList<>();
    
    private String uri;
    
    private int order;
}
