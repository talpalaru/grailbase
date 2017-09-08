package de.dvinci.helix.services

import de.dvinci.helix.domain.Tenant
import grails.gorm.transactions.Transactional

@Transactional
class GormWebinarService {

    def serviceMethod() {
        def nameContains = Tenant.nameQuery("test").list()

    }
}
