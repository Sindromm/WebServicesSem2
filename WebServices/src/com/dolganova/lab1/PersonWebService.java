package com.dolganova.lab1; /**
 * Created by Polina on 23.02.19.
 */

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "PersonService")
public class PersonWebService {

    @WebMethod(operationName = "getPersons")
    public List<Person> getPersons() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Person> persons = dao.getPersons();
        return persons;
    }

    @WebMethod(operationName = "findPeople")
    public List<Person> findPeople(String id, String name, String surname, String age, String profession) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Person> persons = dao.findPeople(id, name, surname, age, profession) ;
        return persons;
    }

}
