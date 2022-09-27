def call (Map config = [:]){
  sh " ${config.project_root};docker build -t ${config.registry}:${config.buildNumber} ."
}
