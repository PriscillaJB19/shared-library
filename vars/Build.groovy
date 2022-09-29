def call (Map config = [:]){
  sh "docker push ${config.registry}:${config.buildNumber} ."
}
