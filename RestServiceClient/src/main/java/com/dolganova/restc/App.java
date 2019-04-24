package com.dolganova.restc;

import com.sun.jersey.api.client.Client;

public class App {
    public static void main(String[] args) {
        Client client = Client.create();
        ActionMenu menu = new ActionMenu();
        menu.start(client);
    }
}
