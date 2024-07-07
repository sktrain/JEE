Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


Aufruf via:
http://localhost:8080/Muster_CDI_BeanScopes/Starter


==========================

Demo für DI mit Lifecycle-Berücksichtigung

==========================


