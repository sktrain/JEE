Übung Contract First:

Es ist für unseren potentiellen simplen HelloService die WSDL
mit Hilfe des WSDL-Editors von Eclipse zu erstellen.

Folgende Operationen sollen via WebService angeboten werden:

    String sayHello(String name);

	Date sayDate();   //liefert Datum

	String sayDateasString();   //liefert Datum als Zeichenkette



Die Codegenerierung erfolgt mit Hilfe des jaxws-Plugin anhand der WSDL (mvn jaxws:wsimport).
Allerdings sind die Artfakte im target-Ordner, der ja beim Clean-Lifecycle gelöscht wird.

Soll also anschließend Codierung anhand der generierten Klassen erfolgen (ist nicht Teil der Aufgabe!):

Kopieren des generierten Package in den Source-Ordner, dann kann es anschließend bei der Codierung verwendet werden.
