Dieses Beispiel läuft mit Wildfly 19, 24, 26, 32 und nutzt CDI2.0 mit
bean-discovery-mode="annotated" statt bean-discovery-mode="all". 
Somit müssen potentielle Beans annotiert werden!
siehe: http://www.mastertheboss.com/jboss-frameworks/cdi/configuring-beans-xml-file/
   bzw.  https://docs.jboss.org/cdi/spec/1.2/cdi-spec-1.2.pdf


Wildfly 24 läuft auf Java 11 und führt auch Java 11 Code aus!
Wildfly 26 läuft auf Java 17 und führt auch Java 17 Code aus!
Wildfly 32 läuft auf Java 17 und führt auch Java 17 Code aus!

Dieses Projekt wurde auf Basis des Archetype "Eclipse Starter For Jakarta EE Archetypes" erzeugt und angepasst.

Sofern ein Wildfly-Server läuft und die JBOSS_HOME-Variable gesetzt ist, kann mit Hilfe des Wildfly-Plugins direkt deployed/undeployed werden.

deploy:
Run the maven goals "clean package wildfly:deploy"

undeploy:
Run the maven goals "wildfly:undeploy"