
package com.dolganova.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dolganova.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBeautyProductsResponse_QNAME = new QName("http://lab1.dolganova.com/", "getBeautyProductsResponse");
    private final static QName _GetBeautyProducts_QNAME = new QName("http://lab1.dolganova.com/", "getBeautyProducts");
    private final static QName _FindBeautyProductResponse_QNAME = new QName("http://lab1.dolganova.com/", "findBeautyProductResponse");
    private final static QName _FindBeautyProduct_QNAME = new QName("http://lab1.dolganova.com/", "findBeautyProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dolganova.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindBeautyProduct }
     * 
     */
    public FindBeautyProduct createFindBeautyProduct() {
        return new FindBeautyProduct();
    }

    /**
     * Create an instance of {@link FindBeautyProductResponse }
     * 
     */
    public FindBeautyProductResponse createFindBeautyProductResponse() {
        return new FindBeautyProductResponse();
    }

    /**
     * Create an instance of {@link GetBeautyProducts }
     * 
     */
    public GetBeautyProducts createGetBeautyProducts() {
        return new GetBeautyProducts();
    }

    /**
     * Create an instance of {@link GetBeautyProductsResponse }
     * 
     */
    public GetBeautyProductsResponse createGetBeautyProductsResponse() {
        return new GetBeautyProductsResponse();
    }

    /**
     * Create an instance of {@link BeautyProduct }
     * 
     */
    public BeautyProduct createBeautyProduct() {
        return new BeautyProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeautyProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "getBeautyProductsResponse")
    public JAXBElement<GetBeautyProductsResponse> createGetBeautyProductsResponse(GetBeautyProductsResponse value) {
        return new JAXBElement<GetBeautyProductsResponse>(_GetBeautyProductsResponse_QNAME, GetBeautyProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBeautyProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "getBeautyProducts")
    public JAXBElement<GetBeautyProducts> createGetBeautyProducts(GetBeautyProducts value) {
        return new JAXBElement<GetBeautyProducts>(_GetBeautyProducts_QNAME, GetBeautyProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBeautyProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "findBeautyProductResponse")
    public JAXBElement<FindBeautyProductResponse> createFindBeautyProductResponse(FindBeautyProductResponse value) {
        return new JAXBElement<FindBeautyProductResponse>(_FindBeautyProductResponse_QNAME, FindBeautyProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBeautyProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "findBeautyProduct")
    public JAXBElement<FindBeautyProduct> createFindBeautyProduct(FindBeautyProduct value) {
        return new JAXBElement<FindBeautyProduct>(_FindBeautyProduct_QNAME, FindBeautyProduct.class, null, value);
    }

}
