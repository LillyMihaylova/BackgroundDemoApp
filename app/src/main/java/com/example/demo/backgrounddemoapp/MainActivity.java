package com.example.demo.backgrounddemoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private CarsAdapter carsAdapter;
    private RecyclerView recyclerView;
    private ArrayList<Car> carsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildList();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        carsAdapter = new CarsAdapter(carsList);
        recyclerView.setAdapter(carsAdapter);

    }

    private void buildList() {
        carsList = new ArrayList<>();
        carsList.add(new Car("bmw", "1999",
                "https://i.pinimg.com/originals/f2/4c/e0/f24ce09855f117cc3d462436f3e290db.png"));
        carsList.add(new Car("audi", "1999",
                "https://i.pinimg.com/originals/f2/4c/e0/f24ce09855f117cc3d462436f3e290db.png"));
        carsList.add(new Car("audi", "2000",
                "https://i.pinimg.com/originals/f2/4c/e0/f24ce09855f117cc3d462436f3e290db.png"));
        carsList.add(new Car("bmw", "2016", "" +
                "https://i.pinimg.com/originals/f2/4c/e0/f24ce09855f117cc3d462436f3e290db.png"));
    }
}
