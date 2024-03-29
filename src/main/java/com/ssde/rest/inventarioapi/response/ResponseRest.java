package com.ssde.rest.inventarioapi.response;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jra, SSDE Inc,
 * on Fri, 29/03/24 at 0:35.
 * inventario-api
 */
public class ResponseRest {
    private ArrayList<HashMap<String,String>> metadata = new ArrayList<>();

    public ArrayList<HashMap<String, String>> getMetadata() {
        return metadata;
    }

    public void setMetadata(String type, String code, String date) {
        HashMap<String,String> map = new HashMap<>();

        map.put("type",type);
        map.put("code",code);
        map.put("date",date);

        metadata.add(map);
    }

}
