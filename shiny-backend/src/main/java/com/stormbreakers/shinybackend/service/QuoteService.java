package com.stormbreakers.shinybackend.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.stormbreakers.shinybackend.dao.Quote;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.sun.tools.doclets.formats.html.markup.HtmlStyle.title;

@Component
public class QuoteService {
    private List<Quote> quotes;

    public QuoteService() {
        quotes = new LinkedList<>();
    }

    public Quote getRandomQuote() {
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("http://api.forismatic.com/api/1.0/")
                    .header("accept", "application/json")
                    .queryString("method", "getQuote")
                    .queryString("format", "json")
                    .queryString("lang", "en")
                    .asJson();
            System.out.println("Finished with json request for quote");
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return new Quote();
    }
}
