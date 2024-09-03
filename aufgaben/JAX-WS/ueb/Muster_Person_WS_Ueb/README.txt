Übung zu JAX-WS:


Übung 1) Es ist ein Web-Service zu erstellen, der Person-Objekte und Liste davon bereit stellt.
Dabei genügt es get-Funktionaltät zu realisieren.
Das Maven-Projekt enthält bereits alle Abhängigkeiten. Der Web-Service kann anschließend schon via SOAPUI
oder ähnlichen Tools aufgerufen werden.

Zum Deployment: 
If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"



Übung 2) Die Person-Objekte sollen um LocalDate-Attribut erweitert werden (ist aktuell auskommentiert).




Übung 3) Ein zugehöriger Client ist zu erstellen, möglichst via Code-Generierung
Beheben Sie eventuelle Probleme durch die Verwendung von LocalDate auf Client-Seite.




Übung 4) Ergänzen Sie den Web-Service auf Client - und Server-Seite um Zugriff auf den WebService-Kontext 
(nur zur Demo).



// Übung 5) Ergänzen Sie den Web-Service um Exception-Handling via WebFault

