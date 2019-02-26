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
    stage('Second Stage') {
      steps {
        echo 'Second'
      }
    }
    stage('Finishing Stage') {
      steps {
        echo 'Done'
      }
    }
  }
  environment {
    Test = ''
  }
}
