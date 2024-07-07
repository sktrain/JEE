Der direkte client-seitige Zugriff auf eine EJB auf Basis von RMI und Objektserialisierung
ist leider immer Server-spezifisch (Properties für den JNDI-Lookup) und die nicht immer 
standardisierte Namensgebung.

Deshalb wird hier spezielle Dependencies je nach Server benutzt.
In diesem Fall für den Wildfly.
