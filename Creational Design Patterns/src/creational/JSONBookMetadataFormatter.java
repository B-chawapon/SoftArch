package creational;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.io.*;
import java.util.*;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.ContainerFactory;
import org.w3c.dom.Element;


public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray jsonArray;
    //private JSONObject jsonObject;

    public JSONBookMetadataFormatter(){
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject obj = new JSONObject();
        obj.put(Book.Metadata.ISBN.value,b.getISBN());
        obj.put(Book.Metadata.TITLE.value,b.getTitle());
        obj.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
//        String[] a = b.getAuthors();
//        System.out.println(Arrays.toString(a));
//        System.out.println(a[0].toString());
//        System.out.println(a[1].toString());
//        System.out.println(a[2].toString());
        obj.put(Book.Metadata.AUTHORS.value,Arrays.toString(b.getAuthors()));
//        System.out.println(obj.get("authors"));
        jsonArray.add(obj);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.

        String jsonText = JSONValue.toJSONString(jsonArray);
        return jsonText;
    }
}
