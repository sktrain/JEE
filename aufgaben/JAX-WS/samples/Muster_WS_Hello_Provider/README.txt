
If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


Simples Beispiel für einen JAX-WS Provider: ist quasi Echo-Service.
Aber prinzipiell kann der Provider anhand der Source jetzt direkt das XML weiterverarbeiten. 


