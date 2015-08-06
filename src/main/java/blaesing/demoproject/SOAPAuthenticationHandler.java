package blaesing.demoproject;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPAuthenticationHandler implements
        SOAPHandler<SOAPMessageContext> {

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public void close(MessageContext arg0) {
    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
        return false;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext smc) {
        System.out.println("Handler called");
        return true;
    }

}
