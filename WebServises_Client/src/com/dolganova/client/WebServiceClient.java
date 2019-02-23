package com.dolganova.client;
/**
 * Created by mvideo on 23.02.19.
 */

import com.dolganova.generated.Person;
import com.dolganova.generated.PersonService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/PersonService?wsdl");

        PersonService personService = new PersonService(url);

        System.out.println("Please, write your query: key=value, separated by comma.");
        System.out.println("Available keys: id, name, surname, age, profession.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            String userQuery = br.readLine();
            String keysValue[] = userQuery.split(",");
            String id = "", name = "", surname = "", age = "", profession = "";
            for (int j = 0; j < keysValue.length; j++) {
                String temp[] = keysValue[j].split("=");
                switch (temp[0]) {
                    case "id":
                        id = temp[1];
                        break;
                    case "name":
                        name = temp[1];
                        break;
                    case "surname":
                        surname = temp[1];
                        break;
                    case "age":
                        age = temp[1];
                        break;
                    case "profession":
                        profession = temp[1];
                        break;
                }
            }

            List<Person> persons = personService.getPersonWebServicePort().findPeople(id, name, surname, age, profession);
            for (Person person : persons) {
                System.out.println("Person{name=" + person.getName() +
                        ", surname=" + person.getSurname() +
                        ", age=" + person.getAge() +
                        ", profession=" + person.getProfession() + "}");
            }
            System.out.println("Total persons: " + persons.size());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

}
