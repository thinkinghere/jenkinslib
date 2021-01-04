package org.devops

def SaltDeploy(host, func) {
  sh "${host} ${func}"
}
