// Jenkinsfile
pipeline {
    agent any

    stages {
        tools
        {
            maven 'maven3'
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Ajoutez ici les commandes pour construire votre projet
                sh 'mvn clean package'

            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Ajoutez ici les commandes pour tester votre projet
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                // Ajoutez ici les commandes pour déployer votre projet
            }
        }
    }
}
