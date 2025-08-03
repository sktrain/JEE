Client mit und ohne Codegenerierung

Die Codegenerierung erfolgt mit Hilfe des jaxws-Plugin anhand der WSDL (mvn jaxws:wsimport).
Allerdings sind die Artfakte im target-Ordner, der ja beim Clean-Lifecycle gelöscht wird.
Zusätzlich betrachtet Eclipse den target-Ordner nicht als Source (ist ja auch Ergebnis des Builds).

Deshalb:
Kopieren des generierten Package in den Source-Ordner, dann kann es anschließend bei der Codierung verwendet werden.

Egal ob mit oder ohne Code-Generierung: java.time.LocalDate wird nicht unterstützt (Stand Jakarta EE 10) !!
(allerdings unterschiedliche Behandlung im jeweiligen Client)
