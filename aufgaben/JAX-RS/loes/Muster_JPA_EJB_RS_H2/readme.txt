Dieses Projekt wurde auf Basis des Archetype "Eclipse Starter For Jakarta EE Archetypes" erzeugt und angepasst.
(org.eclipse.starter:jakarta-starter:2.2.1) 


Wildfly 24 läuft auf Java 11 und führt auch Java 11 Code aus!
Wildfly 26 läuft auf Java 17 und führt auch Java 17 Code aus!

Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


Aufruf z.B. durch Browser via get-Request: http://localhost:8080/Muster_JPA_EJB_RS_H2/rest/employee
bzw.  http://localhost:8080/Muster_JPA_EJB_RS_H2/rest/department

==================================================================================================

Kombination von EJB, die den DB-Zugriff mittels JPA realisiert, und einem REST-Service.
Die  EJB diesmal als Singleton und mit No-Interface-View.

Da auch JAX-RS-Implementierung wie RestEasy (Wildfly) Probleme  mit zyklischen Abhängigkeiten bei den
zu serialisierenden Klassen haben:
Bereinigt um Abhängigkeiten in und zwischen den Tabellen, 
d.h. Schlüssel-Fremdschlüssel-Beziehungen werden nicht mit JPA abgebildet.

Mit 2 Restendpunkten (Root-Klassen), JSON- und XML-Unterstützung und diversen Varianten für das Request-Mapping.


