def call (Map config = [:]){
  sh "cd ${config.proyect_root};docker build -t ${config.registry}:${config.buildNumber} ."
}
