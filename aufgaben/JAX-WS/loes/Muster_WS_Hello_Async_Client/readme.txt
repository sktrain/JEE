Asynchroner Client (nicht blockierend) mit Code-Generierung via jaxws-Plugin mit Binding-File.

Die Codegenerierung erfolgt mit Hilfe des jaxws-Plugin anhand der WSDL (mvn jaxws:wsimport).
Allerdings sind die Artfakte im target-Ordner, der ja beim Clean-Lifecycle gelöscht wird.
Zusätzlich betrachtet Eclipse den target-Ordner nicht als Source (ist ja auch Ergebnis des Builds).

Deshalb:
Kopieren des generierten Package in den Source-Ordner, dann kann es anschließend bei der Codierung verwendet werden.

Leider kann JAXB bis heute (JEE 10) nicht standardmäßig mit den Java8 Date/Time-Typen umgehen!!
(siehe https://jakarta.ee/specifications/xml-binding/4.0/jakarta-xml-binding-spec-4.0#atomic-datatype )

Somit: Ohne entsprechende Vorkehrung, z.B. XMLTypeAdapter, bekommt der Client im besten Fall String geliefert!