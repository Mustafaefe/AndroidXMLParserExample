package com.example.mustafa.kurtakip;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Mustafa on 22.11.2015.
 */
public class HttpGet {


    private static Document doc;

    public static Document getDoc(){
        try {
            String url = "http://www.tcmb.gov.tr/kurlar/today.xml";
            //doc = Jsoup.connect("http://www.tcmb.gov.tr/kurlar/today.xml").ignoreContentType(true).get();
            doc = Jsoup.parse(new URL(url).openStream(), "ISO-8859-9", url);
            //doc.outputSettings().charset("ISO-8859-9");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return doc;
    }
}
