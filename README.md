# dummyService

Using Arquillian Cube!

To run the project please used the build script I have added in the root folder (sh build.sh) from the root folder. 

The only thing that must be is changed is the standalone version in the root pom.xml


      <dependency>
        <groupId>org.jboss.arquillian.testng</groupId>
        <artifactId>arquillian-testng-standalone</artifactId>
        <version>1.4.2.Sarah-SNAPSHOT</version>
      </dependency>

please build a jar using the change i made in the PR and make sure it points to the new jar that has the fix.  

The dummy tests are nested for loops. takes around 10 minutes if not run in parallel. 5 minutes if done with 5 threads. 
