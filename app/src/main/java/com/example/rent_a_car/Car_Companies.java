package com.example.rent_a_car;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Car_Companies extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] menuOptions = {"Economy Car","Truck rental","SUV Rental","Van Rental","Sport Car Rental","Luxury Car Rental"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.cars, menuOptions));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.economyrentacar.com/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprisetrucks.com/truckrental/en_US/vehicles/pickup-trucks/HalfTon4WDPickupTruck-personal.html")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com/en_US/car-rental/cars/us/ffar-fullsize-suv.html")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com/en/cars/vehicles/us/p")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.carrentalexpress.com/specialty/sport-car-rental-rates")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sixt.com/luxury-cars/tampa/#/")));
                break;
        }
    }
}
