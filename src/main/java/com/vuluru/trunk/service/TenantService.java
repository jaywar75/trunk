package com.vuluru.trunk.service;

import com.vuluru.trunk.dto.TenantRequest;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

    // Business logic for onboarding a tenant.
    public boolean onboardTenant(TenantRequest request) {
        System.out.println("Onboarding tenant: " + request.getTenantId());
        // Implement actual logic (e.g., validation, persistence) here.
        return true;
    }
}
