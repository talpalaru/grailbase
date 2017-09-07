package grailbase

class BootStrap {

    def testDataService

    def init = { servletContext ->
        testDataService.init()
    }
    def destroy = {
    }
}
