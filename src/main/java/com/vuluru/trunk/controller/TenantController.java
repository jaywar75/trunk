package com.vuluru.trunk.controller;

import com.vuluru.trunk.dto.TenantRequest;
import com.vuluru.trunk.service.TenantService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tenants")
public class TenantController {

    private final TenantService tenantService;

    // Constructor-based dependency injection for TenantService.
    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    // Existing endpoint to list tenants.
    @GetMapping
    public List<String> getTenants(@RequestParam(required = false, defaultValue = "all") String type) {
        if ("premium".equalsIgnoreCase(type)) {
            return Arrays.asList("Premium Corp", "Elite Industries");
        } else {
            return Arrays.asList("Premium Corp", "Elite Industries", "Acme Inc.", "Global Solutions");
        }
    }

    // New endpoint for automated tenant onboarding.
    @PostMapping("/onboard")
    public String onboardTenant(@RequestBody TenantRequest request) {
        boolean success = tenantService.onboardTenant(request);
        return success ? "Tenant onboarded successfully" : "Onboarding failed";
    }
}