FROM centos

RUN yum install -y java-11-openjdk

VOLUME /tmp
ADD pet-clinic-web-0.0.1-SNAPSHOT.jar petclinic.jar
RUN sh -c 'touch /petclinic.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/petclinic.jar"]
