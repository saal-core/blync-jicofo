# #################################### BUILD STAGE ####################################
FROM maven as build-phase
COPY . /app
WORKDIR /app
RUN mvn dependency:go-offline
# RUN mvn package
RUN mvn clean package -DskipTests

# #################################### RUN STAGE ####################################
FROM scr.saal.ai/jicofo:2

COPY --from=build-phase /app /app

WORKDIR /

RUN cp /app/target/*-jar-with-dependencies.jar /usr/share/jicofo/jicofo.jar

VOLUME /config

ENTRYPOINT [ "/init" ]
