package com.dolganova.restc;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import javax.ws.rs.core.MediaType;

public class App {
    private static final String URL = "http://localhost:8081/rest/beautyProducts";

    public static void main(String[] args) {
        Client client = Client.create();
        processQueryToStandalone(client);

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose service type: 1-standalone, 2-J2EE");
        try {
            String serviceType = br.readLine();
            switch (serviceType) {
                case "1":
                    //beautyProductService = new BeautyProductService(url);
                    processQueryToStandalone(client);
                    break;
                case "2":
                    //beautyProductService = new BeautyProductService(new URL("http://localhost:8080/WebServiceJ2EEServer_war_exploded/BeautyProductService?wsdl"));
                    //processQueryToJ2EE();
                    break;
                default:
                    System.out.println("Wrong enter!");
                    return;
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }*/
    }

    private static void processQueryToStandalone(Client client) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please, select the type of action: 0 - print all, 1 - find, 2 - quit");
            try {
                String actionType = br.readLine();

                switch (actionType) {
                    case "0":
                        getAllBeautyProducts(client);
                        break;
                    case "1":
                        findBeautyProduct(client, br);
                        break;
                    case "2":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choose");
                        break;
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    private static void getAllBeautyProducts(Client client) {
        WebResource webResource = client.resource(URL);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed: " + response.toString());
        }

        GenericType<List<BeautyProduct>> type = new GenericType<List<BeautyProduct>>() {};
        printList(response.getEntity(type));
    }

    private static void findBeautyProduct(Client client, BufferedReader br)
    {
        System.out.println("Please, write your query: key=value, separated by comma.");
        System.out.println("Available keys: id, name, producingСountry, vendorСode, category, price.");

        try {
            String userQuery = br.readLine();
            String keysValue[] = userQuery.split(",");
            String id = "", name = "", producingCountry = "", vendorCode = "", category = "", price = "";
            for (int j = 0; j < keysValue.length; j++) {
                String temp[] = keysValue[j].split("=");
                switch (temp[0]) {
                    case "id":
                        id = temp[1];
                        break;
                    case "name":
                        name = temp[1];
                        break;
                    case "producingCountry":
                        producingCountry = temp[1];
                        break;
                    case "vendorCode":
                        vendorCode = temp[1];
                        break;
                    case "category":
                        category = temp[1];
                        break;
                    case "price":
                        price = temp[1];
                        break;
                }
            }

            WebResource webResource = client.resource(URL);

            if (id != null) {
                webResource = webResource.queryParam("id", id);
            }
            if (name != null) {
                webResource = webResource.queryParam("name", name);
            }
            if (producingCountry != null) {
                webResource = webResource.queryParam("producingCountry", producingCountry);
            }
            if (vendorCode != null) {
                webResource = webResource.queryParam("vendorCode", vendorCode);
            }
            if (category != null) {
                webResource = webResource.queryParam("category", category);
            }
            if (price != null) {
                webResource = webResource.queryParam("price", price);
            }

            ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

            if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
                throw new IllegalStateException("Request failed: " + response.toString());
            }

            GenericType<List<BeautyProduct>> type = new GenericType<List<BeautyProduct>>() {};
            printList(response.getEntity(type));
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

    private static void printList(List<BeautyProduct> products) {
        for (BeautyProduct product : products) {
            System.out.println(product);
        }
    }
}
