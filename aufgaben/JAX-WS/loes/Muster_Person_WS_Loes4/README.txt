
If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


- WebService nutzt Person-Objekte und Liste davon
- XMLTypeAdapter für LocalDate (nur auf der Server-Seite)
- lässt sich WebServiceContext spritzen (über diesen ist auch der Zugriff auf den Servlet-Context möglich)




