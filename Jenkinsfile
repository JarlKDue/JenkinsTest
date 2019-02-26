pipeline {
  agent any
  tools{
    maven 'maven'
    jdk 'jdk8'
  }
  stages {
    stage('First Stage') {
      steps {
        echo 'Test Message'
      }
    }
    stage('Build Stage') {
      steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
      }
    }
    stage('Finishing Stage') {
      steps {
        echo 'Done'
      }
    }
                post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
  }
  environment {
    Test = ''
  }
}
}
