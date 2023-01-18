def call (String stageName){
    if ("${stageName}" == "Build"){
        sh "mvn clean package"
    }
    else if ("${stageName}" == "SonarqubeAnalyses"){
        sh "mvn sonar:sonar"
    }
    else if ("${stageName}" == "UplaodArtifacts"){
        sh "mvn deploy"
    }
}
