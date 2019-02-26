pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        echo 'Test Message'
      }
    }
    stage('Second') {
      steps {
        echo 'Second'
      }
    }
    stage('Done') {
      steps {
        echo 'Done'
      }
    }
  }
  environment {
    Test = ''
  }
}