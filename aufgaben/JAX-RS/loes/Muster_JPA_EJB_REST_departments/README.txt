Dieses Projekt wurde auf Basis des Archetype "Eclipse Starter For Jakarta EE Archetypes" erzeugt und angepasst.
(org.eclipse.starter:jakarta-starter:2.2.1) 

Wildfly 24 läuft auf Java 11 und führt auch Java 11 Code aus!
Wildfly 26 läuft auf Java 17 und führt auch Java 17 Code aus!

Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal  "wildfly:undeploy"


Aufruf im Browser z.Bsp:   http://localhost:8080/Muster_Departments_Rest/rest/departmentserv/getall


==========================
JPA bzgl. Departments + EJB als  Repository +  simples Rest-Frontend mit JSON- und XML-Unterstützung 




