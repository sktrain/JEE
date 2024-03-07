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


Zugriff via Browser: http://localhost:8080/Muster_JPA_EJB_JSF_H2_v1/newEmp.xhtml


==========================

Kombination von EJB, die den DB-Zugriff mittels JPA realisiert, und einem JSF-Frontend.
Als Backing-Bean für die JSF-Views kommt eine CDI-Bean zum Einsatz die sich den lokalen 
Proxy der EJB injizieren lässt.

Bereinigt um Abhängigkeiten in und zwischen den Tabellen, 
d.h. Schlüssel-Fremdschlüssel-Beziehungen werden nicht mit JPA abgebildet.
==========================




