package com.github.phantomv1989.intellijdiabroxplugin.services

import com.github.phantomv1989.intellijdiabroxplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
