package com.cusguss.fungimonitor;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cusguss.fungimonitor.thingspeak.Models.Last;
import com.cusguss.fungimonitor.thingspeak.ThingspeakRestClient;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    //UI elements
    TextView _humidityValueTextView;
    TextView _temperature1ValueTextView;
    TextView _temperature2ValueTextView;
    TextView _temperature3ValueTextView;
    TextView _temperature4ValueTextView;
    TextView _waterRelayValueTextView;
    TextView _fanRelayValueTextView;
    ProgressDialog _progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get UI elements
        _humidityValueTextView = (TextView) findViewById(R.id._humidityValueTextView);
        _temperature1ValueTextView = (TextView) findViewById(R.id._temperature1ValueTextView);
        _temperature2ValueTextView = (TextView) findViewById(R.id._temperature2ValueTextView);
        _temperature3ValueTextView = (TextView) findViewById(R.id._temperature3ValueTextView);
        _temperature4ValueTextView = (TextView) findViewById(R.id._temperature4ValueTextView);
        _waterRelayValueTextView = (TextView) findViewById(R.id._waterRelayValueTextView);
        _fanRelayValueTextView = (TextView) findViewById(R.id._fanRelayValueTextView);
        _progressDialog = new ProgressDialog(this);

        //Set UI elements values
        _progressDialog.setTitle("Loading");
        _progressDialog.setMessage("Retrieving data...");

        refresh();
    }

    public void refreshButtonClickHandler(View view) {

        refresh();
    }


    private void refresh() {

        _progressDialog.show();

        ThingspeakRestClient.API().getLastAsync(new Callback<Last>() {

            @Override
            public void success(Last last, Response response) {

                if (last != null) {

                    _humidityValueTextView.setText(last.getField1());
                    _temperature1ValueTextView.setText(last.getField2());
                    _temperature2ValueTextView.setText(last.getField3());
                    _temperature3ValueTextView.setText(last.getField4());
                    _temperature4ValueTextView.setText(last.getField5());
                    _waterRelayValueTextView.setText(last.getField6());
                    _fanRelayValueTextView.setText(last.getField7());

                }

                _progressDialog.dismiss();


            }

            @Override
            public void failure(RetrofitError error) {

                _progressDialog.dismiss();
            }

        });
    }
}
