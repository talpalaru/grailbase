package de.dvinci.helix.services

import de.dvinci.helix.domain.Tenant
import grails.gorm.transactions.Transactional

@Transactional
class TestDataService {

    void init() {
        // DEFAULT ist die default datasource für tenant, wenn mehrere DS definiert sind kann man sie so mit dem Namen anprechen
        def t = Tenant.DEFAULT.create()
        t.name = "t1"
        t.save()
        new Tenant(name: "t2").save()
    }
}
