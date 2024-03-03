Der Client braucht für den Remote-Zugriff (JNDI-Lookup + Proxy-Generierung) einen Subset
der Server-Bibs. Wie üblich werden diese von der Server-Installation als fertiges 
Client-JAR bereit gestellt. In der Maven-Variante wird statt dem lokalen Client-JAR 
eine Client-BOM benutzt.
Leider liefert der Wildfly keine fertigen JNDI-Properties in diesen Dependencies
mit, die für den JNDI-Lookup erforderlich sind.
-> Zusätzliche Properties sind notwendig!

Beim Lookup muss der richtige Name verwendet werden.


Die per remote-Zugriff ausgetauschten Klassen müssen auf der Clientseite bekannt sein:
Vollqualifizierter Klassenname!!

Simples Kopieren von der Serverseite führt auf der Clientseite zu Compiler-Fehler, 
da dieser die Annotationen nicht versteht (ist zur Laufzeit kein Problem!): 
-> Entweder die benötigten JPA-Libraries auf der Clientseite bereit stellen oder aber die 
Annotationen rauswerfen


Leider verwendet Hibernate unter der Haube interne Klassen bei den Collections und da die 
serialisierten Objekte solche Collectiontypen verwenden führt das ohne Hibernate-Einbindung
auf der Client-Seite zur ClassNotFoundException.
-> Hibernate auf der Client-Seite einbinden oder DTOs benutzen
