
package com.dolganova.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BeautyProductWebService", targetNamespace = "http://lab1.dolganova.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BeautyProductWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.dolganova.generated.BeautyProduct>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeautyProducts", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.GetBeautyProducts")
    @ResponseWrapper(localName = "getBeautyProductsResponse", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.GetBeautyProductsResponse")
    @Action(input = "http://lab1.dolganova.com/BeautyProductWebService/getBeautyProductsRequest", output = "http://lab1.dolganova.com/BeautyProductWebService/getBeautyProductsResponse")
    public List<BeautyProduct> getBeautyProducts();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertBeautyProduct", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.InsertBeautyProduct")
    @ResponseWrapper(localName = "insertBeautyProductResponse", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.InsertBeautyProductResponse")
    @Action(input = "http://lab1.dolganova.com/BeautyProductWebService/insertBeautyProductRequest", output = "http://lab1.dolganova.com/BeautyProductWebService/insertBeautyProductResponse")
    public Integer insertBeautyProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBeautyProduct", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.UpdateBeautyProduct")
    @ResponseWrapper(localName = "updateBeautyProductResponse", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.UpdateBeautyProductResponse")
    @Action(input = "http://lab1.dolganova.com/BeautyProductWebService/updateBeautyProductRequest", output = "http://lab1.dolganova.com/BeautyProductWebService/updateBeautyProductResponse")
    public String updateBeautyProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteBeautyProduct", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.DeleteBeautyProduct")
    @ResponseWrapper(localName = "deleteBeautyProductResponse", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.DeleteBeautyProductResponse")
    @Action(input = "http://lab1.dolganova.com/BeautyProductWebService/deleteBeautyProductRequest", output = "http://lab1.dolganova.com/BeautyProductWebService/deleteBeautyProductResponse")
    public String deleteBeautyProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.dolganova.generated.BeautyProduct>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findBeautyProduct", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.FindBeautyProduct")
    @ResponseWrapper(localName = "findBeautyProductResponse", targetNamespace = "http://lab1.dolganova.com/", className = "com.dolganova.generated.FindBeautyProductResponse")
    @Action(input = "http://lab1.dolganova.com/BeautyProductWebService/findBeautyProductRequest", output = "http://lab1.dolganova.com/BeautyProductWebService/findBeautyProductResponse")
    public List<BeautyProduct> findBeautyProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

}
