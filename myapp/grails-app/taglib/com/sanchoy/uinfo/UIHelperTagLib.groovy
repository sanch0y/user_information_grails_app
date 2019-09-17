package com.sanchoy.uinfo

class UIHelperTagLib {

    static namespace = "UIHelper"
    AuthenticationService authenticationService

    def memberActionMenu = { attrs, body ->
        out << '<li class="nav-item dropdown show">'
        out << g.link(class:"nav-link dropdown-toggle", "data-toggle":"dropdown"){authenticationService.getMemberName()}
        out << '<div class="dropdown-menu">'
        out << g.link(controller: "authentication", action: "changePassword", class: "dropdown-item"){g.message(code:"change.password")}
        out << g.link(controller: "authentication", action: "logout", class: "dropdown-item"){g.message(code:"logout")}
        out << "</div></li>"
    }

    def leftNavigation = { attrs, body ->
        List navigations = [
                [controller: "dashboard", action: "index", name: "dashboard"],
        ]

        if(authenticationService.isAdministratorMember()){
            navigations.add([controller: "member", action: "index", name: "memberlist"])
        }else{
            navigations.add([controller: "authentication", action: "changePassword", name: "change.password"])
        }

        navigations.each { menu ->
            out << '<li class="list-group-item">'
            out << g.link(controller: menu.controller, action: menu.action) { g.message(code: menu.name, args: ['']) }
            out << '</li>'
        }
    }


}
