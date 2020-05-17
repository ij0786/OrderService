package com.nagarro.nagp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	    @GetMapping("/orders/1")
	    public JSONObject getOrders() {
	    
	        JSONObject order1 = new JSONObject();
	        order1.put("orderId", 1);
	        order1.put("orderAmount", 250);
	        order1.put("orderDate", "14-Apr-2020");
	        
	        JSONObject order2 = new JSONObject();
	        order2.put("orderId", 2);
	        order2.put("orderAmount", 450);
	        order2.put("orderDate", "15-Apr-2020");

	        JSONArray ja = new JSONArray();
	        ja.add(order1);
	        ja.add(order2);

	        JSONObject mainObj = new JSONObject();
	        mainObj.put("orders", ja);
	        
		     return mainObj;
	    	
	    }

}
