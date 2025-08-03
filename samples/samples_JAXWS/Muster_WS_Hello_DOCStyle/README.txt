Jakarta EE10 bzw. Jakarta XML Web Services 4.0 

If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


Der Service ist klassisch mit Interface und BindingStyle Document.
Auch mit LocalDate kommt diese JAX-WS-Version (bzw. JAXB) nicht klar. Bei direkter Verwendung
enthält die Antwort keinen Datumstring!