# #################################### BUILD STAGE ####################################
FROM maven as build-phase
COPY . /app
WORKDIR /app
RUN mvn dependency:resolve
RUN mvn clean package
# RUN mvn clean package -DskipTests

# #################################### RUN STAGE ####################################
FROM jitsi/jicofo:latest

COPY --from=build-phase /app /app

WORKDIR /

RUN cp /app/target/jicofo-1.1-SNAPSHOT-jar-with-dependencies.jar /usr/share/jicofo/jicofo.jar

VOLUME /config

ENTRYPOINT [ "/init" ]
