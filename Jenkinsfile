node {
    stage('pull git repo') {
        echo '[STAGE][git pull] Pull src from git repo'
        git branch: 'release', credentialsId: 'github', url: 'https://github.com/EriCZZZZ/timetable-server.git'
    }

    stage('mvn package') {
        echo '[STAGE][mvn package] mvn package'
        sh 'mvn package'
    }
}