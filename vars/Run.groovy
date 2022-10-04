def call (Map config = [:]){
   sh "docker login -u priscillajb -p dckr_pat_FT0zDVqjuc0LvxCdHfNHkXg9Du4 docker.io"
   sh "docker run ${config.registry}:${config.buildNumber}"   
}
