
Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"

Da JAX-WS unnd JAXB sind ab Java 11 nicht mehr Teil der SE, somit externe Dependencies!

==================================================================================================

Aufgabe:

JAX-WS Frontend für unsere JPA-EJB-Variante 
(Kombination von EJB, die den DB-Zugriff mittels JPA realisiert, und dem WebService)


Da JAXB Probleme mit zyklischen Abhängigkeiten:
Bereinigt um Abhängigkeiten in und zwischen den Tabellen, 
d.h. Schlüssel-Fremdschlüssel-Beziehungen werden nicht mit JPA abgebildet


