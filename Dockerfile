FROM amazoncorretto:21

COPY target/demo-app.jar /usr/app/

WORKDIR /usr/app

CMD ["java", "-jar", "demo-app.jar"]