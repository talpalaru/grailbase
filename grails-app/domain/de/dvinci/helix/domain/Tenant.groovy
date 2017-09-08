package de.dvinci.helix.domain

import grails.gorm.MultiTenant

class Tenant implements  MultiTenant<Tenant>{


    static nameQuery = { x ->
        Tenant.where {
            name == x
        }
    }

    String name

    static constraints = {
        name nullable: false
    }
}
