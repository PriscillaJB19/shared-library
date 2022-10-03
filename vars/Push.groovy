def call (Map config = [:]){
   sh "docker login"
   sh "docker push ${config.registry}:${config.buildNumber} ."
}
