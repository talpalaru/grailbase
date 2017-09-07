package de.dvinci.helix.domain

class Tenant {


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
