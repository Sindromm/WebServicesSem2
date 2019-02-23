
package com.dolganova.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test package. 
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

    private final static QName _FindPeopleResponse_QNAME = new QName("http://lab1.dolganova.com/", "findPeopleResponse");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://lab1.dolganova.com/", "getPersonsResponse");
    private final static QName _GetPersons_QNAME = new QName("http://lab1.dolganova.com/", "getPersons");
    private final static QName _FindPeople_QNAME = new QName("http://lab1.dolganova.com/", "findPeople");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindPeople }
     * 
     */
    public FindPeople createFindPeople() {
        return new FindPeople();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link FindPeopleResponse }
     * 
     */
    public FindPeopleResponse createFindPeopleResponse() {
        return new FindPeopleResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "findPeopleResponse")
    public JAXBElement<FindPeopleResponse> createFindPeopleResponse(FindPeopleResponse value) {
        return new JAXBElement<FindPeopleResponse>(_FindPeopleResponse_QNAME, FindPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsResponse> createGetPersonsResponse(GetPersonsResponse value) {
        return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME, GetPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "getPersons")
    public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
        return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.dolganova.com/", name = "findPeople")
    public JAXBElement<FindPeople> createFindPeople(FindPeople value) {
        return new JAXBElement<FindPeople>(_FindPeople_QNAME, FindPeople.class, null, value);
    }

}
