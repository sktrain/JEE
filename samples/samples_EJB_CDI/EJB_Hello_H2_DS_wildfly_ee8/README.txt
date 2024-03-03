Dieses Beispiel läuft sowohl auf EAP 6.x, EAP 7.x, 
als auch Wildfly 8, 9, 10, 11, 15, 19, 24, 26
Voraussetzung: Die Datasource ist eingerichtet und der DB-Server läuft

Wildfly 24 läuft auf Java 11 und führt auch Java 11 Code aus!
Wildfly 26 läuft auf Java 17 und führt auch Java 17 Code aus!

Dieses Projekt wurde auf Basis des Archetype "Eclipse Starter For Jakarta EE Archetypes" erzeugt und angepasst.
(org.eclipse.starter:jakarta-starter:2.2.1) 

Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Run the maven goals "clean package wildfly:deploy"

undeploy:
Run the maven goals "wildfly:undeploy"


