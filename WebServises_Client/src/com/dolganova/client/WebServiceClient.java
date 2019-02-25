package com.dolganova.client;
/**
 * Created by mvideo on 23.02.19.
 */

import com.dolganova.generated.BeautyProduct;
import com.dolganova.generated.BeautyProductService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/BeautyProductService?wsdl");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose service type: 1-standalone, 2-J2EE");
        BeautyProductService beautyProductService;
        try {
            String servType = br.readLine();
            switch (servType) {
                case "1":
                    beautyProductService = new BeautyProductService(url);
                    break;
                case "2":
                    beautyProductService = new BeautyProductService(new URL("http://localhost:8080/WebServiceJ2EEServer_war_exploded/BeautyProductService?wsdl"));
                    break;
                default:
                    System.out.println("Wrong enter!");
                    return;
            }

            System.out.println("Please, write your query: key=value, separated by comma.");
            System.out.println("Available keys: id, name, producingСountry, vendorСode, category, price.");

            String userQuery = br.readLine();
            String keysValue[] = userQuery.split(",");
            String id = "", name = "", producingСountry = "", vendorСode = "", category = "", price="";
            for (int j = 0; j < keysValue.length; j++) {
                String temp[] = keysValue[j].split("=");
                switch (temp[0]) {
                    case "id":
                        id = temp[1];
                        break;
                    case "name":
                        name = temp[1];
                        break;
                    case "producingСountry":
                        producingСountry = temp[1];
                        break;
                    case "vendorСode":
                        vendorСode = temp[1];
                        break;
                    case "category":
                        category = temp[1];
                        break;
                    case "price":
                        price = temp[1];
                        break;
                }
            }

            List<BeautyProduct> beautyProducts = beautyProductService.getBeautyProductWebServicePort().findBeautyProduct(id, name, producingСountry, vendorСode, category, price);
            for (BeautyProduct beautyProduct : beautyProducts) {
                System.out.println("Beauty product{id = " + beautyProduct.getId() +
                        ", name = " + beautyProduct.getName() +
                        ", producingСountry = " + beautyProduct.getProducingСountry() +
                        ", vendorСode = " + beautyProduct.getVendorСode() +
                        ", category = " + beautyProduct.getCategory() +
                        ", price = " + beautyProduct.getPrice() + "}");
            }
            System.out.println("Total beauty products: " + beautyProducts.size());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
