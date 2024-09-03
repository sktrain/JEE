
If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


Der Service ist ohne Interface.
Wie man anhand der generierten WSDL sieht, ist dann auch die public init-Methode angeboten!
(auch wenn diese keine @WebMethod trägt). Von daher ist @WebMethod in dieser Form überflüssig!
(außer wir setzen Attribut exclude)
Auch mit LocalDate kommt diese JAX-WS-Version (bzw. JAXB) nicht klar. Bei direkter Verwendung
enthält die Antwort keinen Datumstring!