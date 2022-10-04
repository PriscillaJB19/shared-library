def call (Map config = [:]){
    //sh "git tag ${config.registry}:${config.buildNumber}"
    sh "git push origin ${config.registry}:${config.buildNumber}"
   //sh "docker push ${config.registry}:${config.buildNumber} ."
}
