package com.example.demo.backgrounddemoapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarsViewHolder> {

    private LoadImageTask loadImageTask;
    private ArrayList<Car> carArrayList;

    public CarsAdapter(ArrayList<Car> cars) {
        this.carArrayList = cars;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_cars, parent, false);
        return new CarsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        holder.txtCarModel.setText(carArrayList.get(position).getModel());
        holder.txtCarYear.setText(carArrayList.get(position).getYear());
        loadImageTask = new LoadImageTask(holder.imgCar);
        loadImageTask.execute(carArrayList.get(position).getPictureUrl());

    }

    @Override
    public int getItemCount() {
        return carArrayList.size();
    }


    public class CarsViewHolder extends RecyclerView.ViewHolder {
        private TextView txtCarModel;
        private TextView txtCarYear;
        private ImageView imgCar;

        public CarsViewHolder(View itemView) {
            super(itemView);

            txtCarModel = itemView.findViewById(R.id.txt_car_model);
            txtCarYear = itemView.findViewById(R.id.txt_car_year);
            imgCar = itemView.findViewById(R.id.img_car);
        }
    }
}
