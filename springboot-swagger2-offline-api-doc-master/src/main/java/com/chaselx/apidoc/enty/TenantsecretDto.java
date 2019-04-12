package com.chaselx.apidoc.enty;

import javax.validation.constraints.NotBlank;

public class TenantsecretDto {
    @NotBlank(message = "tenantID不能为空")
    private String tenantID;
    @NotBlank(message = "tenantSecret不能为空")
    private String tenantSecret;

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public String getTenantSecret() {
        return tenantSecret;
    }

    public void setTenantSecret(String tenantSecret) {
        this.tenantSecret = tenantSecret;
    }
}
