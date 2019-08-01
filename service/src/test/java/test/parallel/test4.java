package test.parallel;

import org.arquillian.cube.DockerUrl;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.testng.Arquillian;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class test4 extends Arquillian {

    // Enrichers - will allow to write portable tests
    @DockerUrl(containerName = "dummyService", exposedPort = 8080)
    @ArquillianResource
    private URL dummyServiceUrl;


    @Test(groups = "critical")
    public void methodThree() throws Exception {
        System.out.println("Hi! This is sarah in method 3");
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i<100000; i++){
            for(int k = 0; k<100000; k++){
                map.put(i,i);
                //System.out.println(i);
            }

        }
    }

}
