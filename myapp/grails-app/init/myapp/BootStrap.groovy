package myapp

import com.sanchoy.uinfo.AppInitializationService

class BootStrap {

    AppInitializationService appInitializationService

    def init = { servletContext ->
        appInitializationService.initialize()
    }
    def destroy = {
    }
}
