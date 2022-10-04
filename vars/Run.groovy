def call (Map config = [:]){
   sh "docker login -u priscillajb -p dckr_pat_FT0zDVqjuc0LvxCdHfNHkXg9Du4 docker.io"
  // docker run -d --name Consola  -p 3000:3000 netconsola
   sh "docker run -d --name Node -p 3000:3000 ${config.registry}:${config.buildNumber}"   
}
