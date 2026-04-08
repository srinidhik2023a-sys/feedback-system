pipeline {
    agent any

    stages {

        stage('Build & Test') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

    }
}