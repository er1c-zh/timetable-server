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
        sh '''#!/bin/sh

        container_id=$(docker ps --all | grep uestc-timetable-server | awk \'{print $1}\')

        if [ -n "$container_id" ]; then
            docker rm -f ${container_id}
        fi
        sleep 1
        docker run -d -p 1220:1220 --name uestc-timetable-server ek1o/uestc-timetable-server:latest'''
    }
}