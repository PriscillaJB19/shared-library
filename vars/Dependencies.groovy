def call(Map config = [:]){
  sh "cd ${config.project_root}; npm --version"
  sh "cd ${config.project_root}; npm install"
}
