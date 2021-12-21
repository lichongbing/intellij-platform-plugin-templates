package com.github.lichongbing.intellijplatformplugintemplates.services

import com.intellij.openapi.project.Project
import com.github.lichongbing.intellijplatformplugintemplates.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
