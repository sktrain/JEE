
Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


==========================

EJB/JPA Projekt mit Mapping der DEPARTMENTS- und EMPLOYEES-Tabellen inklusive
Fremdschlüsselbeziehungen auf Basis des HR-Schemas in einer  H2-Database.
Eine  EJB realisiert das Repository und die notwendige Transaktions-Unterstützung.

Die per RMI ausgetauschten Objekte  müssen "Serializable" sein,  leider gilt das nicht für "Optional".
Deshalb Anpassung gegenüber der lokalen Variante bei den read-Methoden.

Ergänzt um Lifecycle-Methoden in der EJB und Lifecycle-Methoden für JPA-Entities via Listener.

==========================


