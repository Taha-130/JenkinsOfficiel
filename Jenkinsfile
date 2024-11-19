// pipeline1
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Eliaslhl/Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
    }
}