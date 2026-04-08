pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Clone') {
            steps {
                git 'https://github.com/srinidhik2023a-sys/feedback-system.git'
            }
        }
    }
}