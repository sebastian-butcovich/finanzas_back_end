FROM openjdk:21-jdk-slim
## Informar el puerto donde se ejecuta
EXPOSE 8080
## Definir el puerto raíz
WORKDIR /app
## Copiar y pegar dentro del contenedor
COPY ./pom.xml /app
COPY ./.mvn /app/.mvn
COPY ./mvnw /app
## Descargar las dependencias
RUN ./mvnw dependency:go-offline
## Copiar el código fuente
#COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar
COPY ./src /app/src
## construir nuestra aplicación
RUN ./mvnw clean install -DskipTests
## Levantar nuestra aplicación cuando el contenedor inicie
ENTRYPOINT ["java", "-jar", "./target/demo-0.0.1-SNAPSHOT.jar"]