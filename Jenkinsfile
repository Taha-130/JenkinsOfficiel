// pipeline1
pipeline {
    agent any

    stages {
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

        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
            }
        }
    }
}

// pipeline2
pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling the code...'
            }
        }

        stage('Unit Test') {
            steps {
                echo 'Running unit tests...'
            }
        }

        stage('Staging Deploy') {
            steps {
                echo 'Deploying to staging environment...'
            }
        }
    }
}