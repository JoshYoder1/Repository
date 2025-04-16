database:
	javac TestDatabase.java
	java TestDatabase


clean:
	rm *.class

save:
	git add *
	git commit *
	git push origin main
