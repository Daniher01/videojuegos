# Usa una imagen base de Java
FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/videojuegos.jar
# Copia el archivo JAR al contenedor
COPY target/videojuegos.jar /app.jar

# Comando para ejecutar la aplicación cuando el contenedor se inicie
CMD ["java", "-jar", "/app.jar"]
