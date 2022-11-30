# java-spring-hibernate
Java de A a Z.. 
Orientação a Objetos, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB...

Java - orientações iniciais

http://www.oracle.com/technetwork/java/javase
Dar preferência para a última versão LTS - Long Term Support.
As versões intermediárias são descontinuadas rapidamente.

Java ME - Java Micro Edition - dispositivos embarcados e móveis - IoT.
http://www.oracle.com/technetwork/java/javame 

Java SE - Java Standard Edition - core - desktop e servidores.
http://www.oracle.com/technetwork/java/javase 

Java EE - Java Enterprise Edition - aplicações corporativas.
http://www.oracle.com/technetwork/java/javaee 

Comece pelo Java SE !

Documentação
https://docs.oracle.com/en/java/javase/11/

Compilação e interpretação :

Linguagem compilada (usa compilador) :
	vantagem : aplicações mais rápidas pois o código fonte é compilado para um programa executável, rodado diretamente no S.O.
	desvantagem : precisa ser recompilado para o Sistema Operacional específico. Caso mude de S.O., é preciso fazer alterações e recompilar.
Linguagem interpretada (usa interpretador) :
	vantagem : funciona em Sistemas Operacionais diferentes com o mesmo código, muda apenas o interpretador.
	desvantagem : as aplicações tendem a ser mais lentas, pois a compilação é feita sob demanda, pelo interpretador
Linguagens híbridas (realiza uma pré-compilação do código fonte para o ByteCode, interpretado pela JVM - melhor dos dois mundos)
	vantagem : utilizam JVM para cada sistema operacional, é relativamente rápido, pois é feita a compilação just-in-time ByteCode, 
		   que é pré compilado, o que garante um código sem erros.
Linguagens compiladas: C, C++
Linguagens interpretadas: PHP, JavaScript
Linguagens pré-compiladas + máquina virtual: Java, C#

JVM (Java Virtual Machine) - Máquina virtual do Java - necessário para executar sistemas Java
