//noinspection GroovyUnusedAssignment
databaseChangeLog = {

    changeSet(author: 'tami', id: ' 1 ') {
        createTable(tableName: "tenant") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "PK_TENANT")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }
            column(name: "name", type: "varchar(1000)") {
                constraints(nullable: "false")
           }
        }
    confirm ' DB changes succesfully done.'
    }
}
