FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/hola-mundo*.jar hola-mundo.jar
CMD java ${JAVA_OPTS} -jar hola-mundo.jar