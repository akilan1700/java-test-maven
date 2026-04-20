package com.example;

import org.apache.commons.lang3.StringUtils;
import org.apache.hc.client5.http.fluent.Request;

public class App {
    public static void main(String[] args) throws Exception {

        String name = "SBOM Test";
        System.out.println("Hello " + StringUtils.upperCase(name));

        // Sample HTTP call
        String response = Request.get("https://jsonplaceholder.typicode.com/todos/1")
                .execute()
                .returnContent()
                .asString();

        System.out.println("API Response: " + response);
    }
}