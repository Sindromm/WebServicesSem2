package com.dolganova.lab1;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService(serviceName = "PersonService")
public class PersonWebService {
    @Resource(lookup = "jdbc/mvideo")
    private DataSource dataSource;

    @WebMethod(operationName = "getPersons")
    public List<Person> getAllPersons() {
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getPersons();
    }

    @WebMethod(operationName = "findPeople")
    public List<Person> findPeople(String id, String name, String surname, String age, String profession) {
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.findPeople(id, name, surname, age, profession);
    }

    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        }
        catch (SQLException ex) {
            Logger.getLogger(PersonWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
