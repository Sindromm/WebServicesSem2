package com.dolganova.lab1;
/**
 * Created by Polina on 23.02.19.
 * Данный класс содержит main метод, основная цель которого – это запустить веб- сервис.
 * Данный код нужен только для запуска сервиса как standalone-приложение.
 * Для запуска веб-сервисов используется класс Endpoint, со статическими методами publish.
 * Данный метод принимает на вход URL, по которому сервис будет доступен, а также класс-реализацию веб-сервиса.
 */

import javax.xml.ws.Endpoint;

public class App {
        public static void main(String[] args) {
            System.out.println("Start");
            String url = "http://0.0.0.0:8080/PersonService";
            Endpoint.publish(url, new PersonWebService());
        }
}
