
package com.dolganova.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BeautyProductService", targetNamespace = "http://lab1.dolganova.com/", wsdlLocation = "http://localhost:8080/BeautyProductService?wsdl")
public class BeautyProductService
    extends Service
{

    private final static URL BEAUTYPRODUCTSERVICE_WSDL_LOCATION;
    private final static WebServiceException BEAUTYPRODUCTSERVICE_EXCEPTION;
    private final static QName BEAUTYPRODUCTSERVICE_QNAME = new QName("http://lab1.dolganova.com/", "BeautyProductService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/BeautyProductService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BEAUTYPRODUCTSERVICE_WSDL_LOCATION = url;
        BEAUTYPRODUCTSERVICE_EXCEPTION = e;
    }

    public BeautyProductService() {
        super(__getWsdlLocation(), BEAUTYPRODUCTSERVICE_QNAME);
    }

    public BeautyProductService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BEAUTYPRODUCTSERVICE_QNAME, features);
    }

    public BeautyProductService(URL wsdlLocation) {
        super(wsdlLocation, BEAUTYPRODUCTSERVICE_QNAME);
    }

    public BeautyProductService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BEAUTYPRODUCTSERVICE_QNAME, features);
    }

    public BeautyProductService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BeautyProductService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BeautyProductWebService
     */
    @WebEndpoint(name = "BeautyProductWebServicePort")
    public BeautyProductWebService getBeautyProductWebServicePort() {
        return super.getPort(new QName("http://lab1.dolganova.com/", "BeautyProductWebServicePort"), BeautyProductWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BeautyProductWebService
     */
    @WebEndpoint(name = "BeautyProductWebServicePort")
    public BeautyProductWebService getBeautyProductWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lab1.dolganova.com/", "BeautyProductWebServicePort"), BeautyProductWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BEAUTYPRODUCTSERVICE_EXCEPTION!= null) {
            throw BEAUTYPRODUCTSERVICE_EXCEPTION;
        }
        return BEAUTYPRODUCTSERVICE_WSDL_LOCATION;
    }

}