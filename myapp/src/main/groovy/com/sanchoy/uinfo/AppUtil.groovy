package com.sanchoy.uinfo

import org.grails.web.util.WebUtils

/**
 * Created by HP on 9/7/2019.
 */
class AppUtil {

    static saveResponse(Boolean isSuccess, def model) {
        return [isSuccess: isSuccess, model: model]
    }

    static getAppSession() {
        return WebUtils.retrieveGrailsWebRequest().session
    }

    static infoMessage(String message, boolean status = true) {
        return [info: message, success: status]
    }

}
