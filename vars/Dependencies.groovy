def call(Map config = [:]){
  sh "${config.project_root}; npm install"
}
