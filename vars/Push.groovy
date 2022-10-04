def call (Map config = [:]){
    sh "git tag ${config.registry}"
    sh "git push ${config.registry}:${config.buildNumber}"
   //sh "docker push ${config.registry}:${config.buildNumber} ."
}
