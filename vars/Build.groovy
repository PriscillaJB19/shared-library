def call (Map config = [:]){
  sh "dotnet build -t ${config.registry}:${config.buildNumber} ."
}
