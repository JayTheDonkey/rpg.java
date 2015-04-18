test: build run clean

build:
	javac -cp Lib:Lib/json-simple.jar:. *.java **/*.java

run:
	java -cp Lib:Lib/json-simple.jar:Combat:Creatures:Data:Effects:Items:Nodes:. RPG

clean:
	rm -f *.class **/*.class
