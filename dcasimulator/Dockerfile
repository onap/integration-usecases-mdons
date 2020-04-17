FROM java:openjdk-8
ARG JAR_FILE=target/dcasimulator-0.1.0.jar
COPY ${JAR_FILE} app.jar
COPY json-files/* /opt/onap/dcasimulator/templates/
ADD entrypoint.sh .
RUN chmod +x entrypoint.sh
EXPOSE 8080
ENTRYPOINT ["./entrypoint.sh"]
