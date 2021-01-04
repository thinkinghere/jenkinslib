package org.devops

def SaltDeploy(host, func) {
  salt "${host} ${func}"
}
