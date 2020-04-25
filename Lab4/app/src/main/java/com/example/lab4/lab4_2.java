package com.example.lab4;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class lab4_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_lab4_2);

        final TextView apple = findViewById(R.id.apple);
        final TextView google = findViewById(R.id.google);
        final TextView facebook = findViewById(R.id.facebook);
        final TextView nokia = findViewById(R.id.nokia);

        fetch("Apple","AAPL", apple);
        fetch("Google","GOOGL", google);
        fetch("Facebook","FB", facebook);
        fetch("Nokia","NOK", nokia);
    }

    public void fetch(final String company , final String id , final TextView view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://financialmodelingprep.com/api/company/price/"+id+"?datatype=json";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject brand = response.getJSONObject(id);
                    String price = brand.getString("price");
                    view.setText(company + " : " + price + " USD ");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("error", "error");
            }
        });
        queue.add(jsonObjectRequest);
    }
}
