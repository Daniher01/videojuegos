# Imagen base de Java para construir la aplicación
FROM maven:3.8.4-openjdk-11-slim AS builder

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo pom.xml
COPY pom.xml .

# Descargar las dependencias de Maven
RUN mvn dependency:go-offline -B

# Copiar el código fuente de la aplicación
COPY src ./src

# Empaquetar la aplicación en un archivo JAR
RUN mvn package -DskipTests

# Usa una imagen base de Java
FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/videojuegos.jar
# Copia el archivo JAR al contenedor
COPY target/videojuegos.jar /app.jar

# Comando para ejecutar la aplicación cuando el contenedor se inicie
CMD ["java", "-jar", "/app.jar"]
