export MAVEN_OPTS="-Xmx2g -XX:MaxPermSize=1024m"
mvn clean install  -Dhadoop.version="2.7.3.2.5.0.0-1245" -DskipTests -Passemble
