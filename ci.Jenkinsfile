#!groovy

@Library('jenkinslib@main') _

def build = new org.devops.build()

String buildType = "${env.buildType}" // 参数构建传入
String buildShell = "${env.buildShell}" // 参数构建传入


//Pipeline
pipeline {
    agent {node { label "main"}}
    
    stages {
        stage("build") {
            steps {
                script {
                    build.Build(buildType, buildShell)
                }
            }
        }
    }
}
