package com.abc.explorehub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Third_Activity extends AppCompatActivity {
   // private static final String QUERY_URL = "http://openlibrary.org/search.json?q=";
    //private Fragment MainEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);
    }

    public void QUESTIONS_PAPER(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/0/folders/1TBjgfsU0papGTwTdjmVEaJXahYytBrJD"));
        startActivity(intent);

    }
    public void EXPLORE(View view){
        Intent intent=new Intent(this,Excomp1.class);
        startActivity(intent);
    }




    //private void queryBooks(String searchString) {

        // Prepare your search string to be put in a URL
        // It might have reserved characters or something
      //  String urlString = "";
        //try {
          //  urlString = URLEncoder.encode(searchString, "UTF-8");
        //} catch (UnsupportedEncodingException e) {

            // if this fails for some reason, let the user know why
          //  e.printStackTrace();
            //Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
       // }

        // Create a client to perform networking
        //AsyncHttpClient client = new AsyncHttpClient();

        // Have the client get a JSONArray of data
        // and define how to respond
        //client.get(QUERY_URL + urlString,
          //      new JsonHttpResponseHandler() {

            //        @Override
              //      public void onSuccess(JSONObject jsonObject) {
                        // Display a "Toast" message
                        // to announce your success
                //        Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_LONG).show();

                        // 8. For now, just log results
                  //      Log.d("omg android", jsonObject.toString());
                   // }

                    //@Override
                    //public void onFailure(int statusCode, Throwable throwable, JSONObject error) {
                        // Display a "Toast" message
                        // to announce the failure
                      //  Toast.makeText(getApplicationContext(), "Error: " + statusCode + " " + throwable.getMessage(), Toast.LENGTH_LONG).show();

                        // Log error message
                        // to help solve any problems
                        //Log.e("omg android", statusCode + " " + throwable.getMessage());
                    //}
                //});
    //}
    //public void EXPLORE(View view) {
        // 9. Take what was typed into the EditText and use in search
      //  queryBooks(MainEditText.getText().toString());


    //}
}