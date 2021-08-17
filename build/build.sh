rm *.java *.class
cp ../App.java App.java
cp ../Feature.java Feature.java
cp ../ImprovedFeature.java ImprovedFeature.java
javac -cp . *.java
java -cp . App
