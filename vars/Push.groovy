def call (Map config = [:]){
  //  sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR password stdin'
   // sh "git push ${config.registry}:${config.buildNumber}"
    
     docker.withRegistry('priscillajb-dockerhub') {
            app.push("${config.registry}:${config.buildNumber}")
     }
    
   //sh "docker push ${config.registry}:${config.buildNumber} ."
}
