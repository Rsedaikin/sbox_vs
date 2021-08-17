rm app.java feature.java app.class feature.class
cp ../app.java app.java
cp ../feature.java feature.java
javac -cp . *.java
java -cp . app
