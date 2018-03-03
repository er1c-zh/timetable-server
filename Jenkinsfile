node {
    stage('pull git repo') {
        echo '[STAGE][git pull] Pull src from git repo'
        git branch: 'release', credentialsId: 'github', url: 'https://github.com/EriCZZZZ/timetable-server.git'
    }

    stage('mvn package') {
        echo '[STAGE][mvn package] mvn package'
        sh 'mvn package'
    }

    stage('deploy to docker') {
        sh 'docker rm -f uestc-timetable-server'
        sh 'sleep 1'
        sh 'dcoker run -d -p 1220:1220 --name uestc-timetable-server ek1o/uestc-timetable-server:latest'
    }
}