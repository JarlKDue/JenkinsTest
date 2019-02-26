pipeline {
  agent any
  tools{
    maven 'Maven 3.3.9'
    jdk 'jdk8'
  }
  stages {
    stage('First Stage') {
      steps {
        echo 'Test Message'
                        sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
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
