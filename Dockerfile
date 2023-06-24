# Usa una imagen base de Java
FROM openjdk:17-jdk-alpine

# Copia el archivo JAR al contenedor
COPY target/videojuegos.jar /app.jar

# Expone el puerto en el que se ejecuta tu aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación cuando el contenedor se inicie
CMD ["java", "-jar", "/app.jar"]
