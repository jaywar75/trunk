package com.vuluru.trunk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class TenantController {
    @GetMapping("/tenants")
    public List<String> getTenants(@RequestParam(required = false, defaultValue = "all") String type) {
        if ("premium".equalsIgnoreCase(type)) {
            return Arrays.asList("Premium Corp", "Elite Industries");
        } else {
            return Arrays.asList("Premium Corp", "Elite Industries", "Acme Inc.", "Global Solutions");
        }
    }
}