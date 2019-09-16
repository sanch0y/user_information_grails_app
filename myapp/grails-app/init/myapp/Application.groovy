package myapp

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        System.out.println("Grails Successful !!!");
        GrailsApp.run(Application, args)
    }
}