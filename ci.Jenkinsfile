#!groovy

@Library('jenkinslib') _

def build = new org.devops.build()
def deploy = new org.devops.deploy() //salt
String buildType = "${env.buildType}" // 参数构建传入
String buildShell = "${env.buildShell}" // 参数构建传入


//Pipeline
pipeline {
    agent any
    
    stages {
        stage("build") {
            steps {
                script {
                    build.Build(buildType, buildShell)
                }
            }
        }
        
        stage("deploy") {
            steps {
                script {
                    deploy.SaltDeploy("centos-linux.shared", "test.ping")
                }
            }
        }
    }
}
