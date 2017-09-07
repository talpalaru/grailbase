package de.dvinci.helix.services

import de.dvinci.helix.domain.Tenant
import grails.gorm.transactions.Transactional

@Transactional
class TestDataService {

    void init() {
        new Tenant(name: "t1").save()
        new Tenant(name: "t2").save()

        def searchName = "t1"
        def nameContains = Tenant
        .nameQuery("t1")
            .list()
        println(nameContains)
    }
}
