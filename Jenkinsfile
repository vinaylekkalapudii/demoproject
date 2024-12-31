pipeline {
    agent any
    environment{
        IMAGE_NAME= "vinaylekkalapudii/newone"
        IMAGE_TAG= "v${BUILD_NUMBER}"
    }

    stages {
        stage('git checkout') {
            steps {
                git 'https://github.com/vinaylekkalapudii/demoproject'            
            }
        }
        stage('docker build'){
            steps{
                 sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
            }
        }
        stage('Docker Run') {
            steps {
                    sh "docker-compose -f docker-compose.yml up -d"
                }
            }
        
}
}
