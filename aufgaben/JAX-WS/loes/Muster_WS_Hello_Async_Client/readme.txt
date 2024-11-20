Ein Basis Maven Projekt mit aktuellen Plugin-Versionen vom Januar 2023
+ Jupiter-Dependencies
+ Client für Jakarta-WS-Zugriff (EE10)

Asynchroner Client (nicht blockierend)

Leider kann JAXB bis heute (JEE 10) nicht standardmäßig mit den Java8 Date/Time-Typen umgehen!!
(siehe https://jakarta.ee/specifications/xml-binding/4.0/jakarta-xml-binding-spec-4.0#atomic-datatype )

Somit: Ohne entsprechende Vorkehrung, z.B. XMLTypeAdapter, bekommt der Client im besten Fall String geliefert!