
If Wildfly-Server is running and JBOSS_HOME-Variable is set, you can deploy/undeploy based on
Wildfly-Plugin.

deploy:
Maven Goal "clean package wildfly:deploy"

undeploy:
Maven Goal "wildfly:undeploy"


WebService nutzt Person-Objekte und Liste davon:
Leider kann JAXB bis heute (JEE 10) nicht standardmäßig mit den Java8 Date/Time-Typen umgehen!!
(siehe https://jakarta.ee/specifications/xml-binding/4.0/jakarta-xml-binding-spec-4.0#atomic-datatype )

Somit: Ohne entsprechende Vorkehrung, z.B. XMLTypeAdapter, werden diese Werte ignoriert!
