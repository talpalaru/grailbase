package de.dvinci.helix.controller

class TenantController {

    def index() {
        render Tenant.findAll()
    }
}
