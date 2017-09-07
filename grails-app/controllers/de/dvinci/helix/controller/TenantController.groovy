package de.dvinci.helix.controller

import de.dvinci.helix.domain.Tenant

class TenantController {

    def index() {
        render Tenant.findAll()
    }


    def show() {
        render Tenant
            .nameQuery("t1")
            .list()
    }
}
