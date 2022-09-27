def call (Map config = [:]){
  sh "cd ./${config.project_root};docker build -t ${config.registry}:${config.buildNumber} ."
}
