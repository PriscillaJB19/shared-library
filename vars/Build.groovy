def call (Map config = [:]){
  sh "docker build -t ${config.registry}:${config.buildNumber} ."
}
