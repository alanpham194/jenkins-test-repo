pipeline {
    agent {
        docker {
            label 'slave-maven'
        }
    }
    stages {
        stage('Install dependencies') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Deploy'){

        }
    }
}