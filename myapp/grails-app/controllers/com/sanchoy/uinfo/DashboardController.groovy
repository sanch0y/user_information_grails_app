package com.sanchoy.uinfo

class DashboardController {

    MemberService memberService
    AuthenticationService authenticationService

    def index() {
        Member member = authenticationService.getNormalMember()
        def response = memberService.getById(member.id)
        [member: response]
    }


}
