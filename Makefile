test: build run clean

build:
	javac -cp ./json-simple.jar:. *.java

run:
	java -cp ./json-simple.jar:. RPG

clean:
	rm *.class
