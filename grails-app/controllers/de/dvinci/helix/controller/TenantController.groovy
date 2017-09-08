package de.dvinci.helix.controller

import de.dvinci.helix.domain.Tenant

class TenantController {

    def index() {
        respond Tenant.findAll()
    }


//    def show(tenant) {
//        respond Tenant
//            .nameQuery(tenant.name)
//            .findAll()?.first()
//    }
}
