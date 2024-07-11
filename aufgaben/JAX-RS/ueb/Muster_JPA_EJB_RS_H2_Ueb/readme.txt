
Wildfly 24 läuft auf Java 11 und führt auch Java 11 Code aus!
Wildfly 26 läuft auf Java 17 und führt auch Java 17 Code aus!

Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"



==================================================================================================

Aufgabe: Unsere JPA-EJB-Variante mit einem entsprechenden Rest-Frontend zu versehen.
Minimal sollte das Rest-Frontent die CRUD-Operationen bzgl. einer der beiden Entitäten realisieren (z.Bsp. Department)

Da auch JAX-RS-Implementierung wie RestEasy (Wildfly) Probleme  mit zyklischen Abhängigkeiten bei den
zu serialisierenden Klassen haben:
Bereinigt um Abhängigkeiten in und zwischen den Tabellen, 
d.h. Schlüssel-Fremdschlüssel-Beziehungen werden nicht mit JPA abgebildet.




