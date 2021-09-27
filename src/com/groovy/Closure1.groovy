package com.groovy

import groovy.transform.*
import groovy.json.*


def listInfo=["Name":"Raja","City":"Hyderabad","Country":"India"]
JsonOutput.prettyPrint(JsonOutput.toJson(listInfo))

