package com.jamshidbek.umscodes.Models

class MinutesModel {

    var minutes = ""
    var code = ""
    var desc = ""

    constructor(minutes: String, code: String, desc: String) {
        this.minutes = minutes
        this.code = code
        this.desc = desc
    }
}