Übung zu JAX-WS:


Übung 1) Es ist ein Web-Service zu erstellen, der einzelne Person-Objekte bzw. eine Liste aller Person-Objekte bereit stellt.
Dabei sollte im Minimum get-Funktionalität realisiert werden.
Das Maven-Projekt enthält bereits alle Abhängigkeiten. Der Web-Service kann anschließend schon via SOAPUI
oder ähnlichen Tools aufgerufen werden.

Zum Deployment: 
If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"



Übung 2) Die Person-Objekte sollen um ein LocalDate-Attribut erweitert werden (ist aktuell auskommentiert).
Das LocalDate-Attribut soll als Datum erfolgreich übertragen werden.




Übung 3) Ein zugehöriger Client ist zu erstellen, sowohl codiert als auch via Code-Generierung
Beheben Sie eventuelle Probleme durch die Verwendung von LocalDate auf Client-Seite.




Übung 4) Ergänzen Sie den Web-Service auf Client - und Server-Seite um Zugriff auf den WebService-Kontext 
Nur zur Demo: Greifen Sie auf den Kontext zu und geben ein paar Dinge davon aus.



Übung 5) Ergänzen Sie den Web-Service um Exception-Handling via WebFault

