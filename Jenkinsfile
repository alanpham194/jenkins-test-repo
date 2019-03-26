pipeline {
    agent {label 'slave-maven'}
    stages {
        stage('Install dependencies') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Deploy to server'){
            steps{
                echo "Deploy................"
                sh 'ls'
                sh 'pwd'
                sshPublisher(
                            publishers:[
                                sshPublisherDesc(configName:'general_service_test',verbose:true,transfers:[
                                    sshTransfer(
                                        sourceFiles:"target/test.war",
                                        remoteDirectory:"~"
                                    ),
                                    sshTransfer(
                                        //exec commands
                                        execCommand: 'echo "done build................."'
                                    )
                                ])
                        ])
            }
        }
    }
}