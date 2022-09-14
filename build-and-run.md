# ERP Eureka Service

## Maven

### Build

mvn clean install

### Run

cd target

java -jar file-name.jar

java -jar file-name.jar --spring.profiles.active=localhost

java -jar file-name.jar --spring.profiles.active=development

java -jar file-name.jar --spring.profiles.active=production

## Docker

### Build

docker build -t erp-eureka-service:latest -f Dockerfile .

### Run

docker run -it --restart always --name erp-eureka-service -p 1000:1000 -e SPRING_PROFILES_ACTIVE=localhost erp-eureka-service:latest

docker run -it --restart always --name erp-eureka-service -p 1000:1000 -e SPRING_PROFILES_ACTIVE=development erp-eureka-service:latest

docker run -it --restart always --name erp-eureka-service -p 1000:1000 -e SPRING_PROFILES_ACTIVE=production erp-eureka-service:latest

#### SPRING_PROFILES_ACTIVE (env)

localhost, development, production
