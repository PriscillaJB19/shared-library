def call (Map config = [:]){
   //sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR password stdin'
   sh "docker push ${config.registry}:${config.buildNumber}"
}
