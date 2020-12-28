package org.devops

def Build(buidType, buildShell) {
  def buildTools = ["mvn":"M2", "ant":"ANT", "gradle":"GRADLE", "npm":"NPM"] // 定义映射
  
  println("当前的构建类型是: ${buidType}")
  buildHome = tool buildTools[buidType]
  
  sh "${buildHome}/bin/${buidType} ${buildShell}"
}
