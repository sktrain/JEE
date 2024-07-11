
Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"

JAX-WS und JAXB sind ab Java 11 nicht mehr Teil der SE, somit externe Dependencies!

==================================================================================================

Kombination von EJB, die den DB-Zugriff mittels JPA realisiert, und dem WebService

!! Allerdings gibt es bei den Zugriffen durch Clients generell eine Exception, da JAXB auf 
der Serverseite zur Laufzeit keine zyklischen Abhängigkeiten in XML-Konstrukte abbilden kann !!

(Ursache:  Employee-Objekt verweist auf Department-Objekt, welches wiederum auf Employee-Objekt verweist,
da die Schlüsselbeziehungen bidirektional bzgl. JPA abgebildet wurden)

Mögliche Strategien zur Fehlerbehebung:
 - Vermeidung der Abbildung der zyklischen Beziehungen durch JPA 
 - generelle Vermeidung von direkter Abbildung via JAXB von Objekten der Entitätsklassen
 - ...


Getestet werden kann z.B. durch SoapUi