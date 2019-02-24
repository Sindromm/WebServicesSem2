package com.dolganova.lab1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSQLDAO {
    private Connection connection;

    public PostgreSQLDAO(){};

    public PostgreSQLDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from persons");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                String profession = rs.getString("profession");
                Person person = new Person(id, name, surname, age, profession);
                persons.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }


    public List<Person> findPeople(String id, String name, String surname, String age, String profession) {
        ArrayList<String> query_where = new ArrayList<String>();
        if (!id.isEmpty()) query_where.add("id='" + id + "'");
        if (!name.isEmpty()) query_where.add("name='" + name + "'");
        if (!surname.isEmpty()) query_where.add("surname='" + surname + "'");
        if (!age.isEmpty()) query_where.add("age=" + age + "");
        if (!profession.isEmpty()) query_where.add("profession='" + profession + "'");

        String query = new String();
        if (query_where.size() > 0)
            query = "select * from persons where " + String.join(" and ", query_where);

        List<Person> persons = findPeople(query);
        return persons;
    }

    public List<Person> findPeople(String query) {
        List<Person> persons = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String age = rs.getString("age");
                String profession = rs.getString("profession");
                Person person = new Person(id, name, surname, Integer.parseInt(age), profession);
                persons.add(person);
                System.out.println("get person");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
}
