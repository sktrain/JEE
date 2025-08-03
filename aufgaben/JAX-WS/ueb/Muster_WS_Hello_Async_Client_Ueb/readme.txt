Übung:

Es ist ein asynchroner Client für den Web-Service zu erstellen.
Die entsprechende Binding-Datei für die Erzeugung der asynchronen
Varianten bei der Code-Generierung liegt bereits bei.



Die Codegenerierung erfolgt mit Hilfe des jaxws-Plugin anhand der WSDL (mvn jaxws:wsimport).
Allerdings sind die Artfakte im target-Ordner, der ja beim Clean-Lifecycle gelöscht wird.
Zusätzlich betrachtet Eclipse den target-Ordner nicht als Source (ist ja auch Ergebnis des Builds).

Deshalb:
Kopieren des generierten Package in den Source-Ordner, dann kann es anschließend bei der Codierung verwendet werden.

