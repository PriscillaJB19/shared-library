def call (Map config = [:]){
   //sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR password stdin'
   //sh "docker login registry-1.docker.io"
   sh "docker login -u priscillajb -p dckr_pat_FT0zDVqjuc0LvxCdHfNHkXg9Du4 docker.io"
   sh "docker push ${config.registry}:${config.buildNumber}"   
}
