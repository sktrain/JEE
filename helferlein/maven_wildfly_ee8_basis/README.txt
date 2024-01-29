Dieses Projekt wurde auf Basis des Archetype "Eclipse Starter For Jakarta EE Archetypes" erzeugt und angepasst.
(org.eclipse.starter:jakarta-starter:2.2.1) 
Es stellt eine Projekt-Schablone für entsprechende JEE8-Projekte bereit, die entsprechend angepasst werden kann.

Wildfly 24 läuft auf Java 11 und führt auch Java 11 Code aus!
Wildfly 26 läuft auf Java 17 und führt auch Java 17 Code aus!

Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


==========================

DataSource:
This sample includes a "persistence.xml" file in "src/main/resources/META-INF". This file defines
a persistence unit "maven_wildfly_ee8PersistenceUnit" which uses the JakartaEE default database.

In production environment, you should define a database in WildFly config and point to this database
in "persistence.xml".

If you don't use entity beans, you can delete "persistence.xml".
==========================

CDI:
The web application is prepared for CDI 2.0 by bundling an "beans.xml" in "src/main/webapp/WEB-INF".

==========================


