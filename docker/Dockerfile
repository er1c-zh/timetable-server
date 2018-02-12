FROM java:8-jdk-alpine
MAINTAINER Eric ericzhao96@hotmail.com

ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/timetable/server/timetable-server.jar"]

EXPOSE 1220

ARG JAR_FILE_NAME

ADD out/${JAR_FILE_NAME} /opt/timetable/server/timetable-server.jar
