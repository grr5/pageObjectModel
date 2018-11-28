pipeline {
  agent {
    node {
      label 'lab'
    }

  }
  stages {
    stage('') {
      steps {
        build(job: 'test', propagate: true, quietPeriod: 2, wait: true)
      }
    }
  }
}