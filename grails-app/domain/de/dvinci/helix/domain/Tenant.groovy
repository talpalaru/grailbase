package de.dvinci.helix.domain

class Tenant {

    String name

    static constraints = {
        name nullable: false
    }
}
