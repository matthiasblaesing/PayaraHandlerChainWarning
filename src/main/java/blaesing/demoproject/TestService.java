package blaesing.demoproject;

import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService
@Stateless
@HandlerChain(file = "/META-INF/handlers.xml")
public class TestService {

    public String halloWelt(String name) {
        return "Hallo " + name;
    }
}
