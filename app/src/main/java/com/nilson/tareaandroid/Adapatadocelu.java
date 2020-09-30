package com.nilson.tareaandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapatadocelu extends RecyclerView.Adapter<Adapatadocelu.MyViewHolderinfodato> {


    ArrayList<infodato> celu;

    public Adapatadocelu(ArrayList<infodato> celu) {
        this.celu = celu;
    }

    @NonNull
    @Override
    public Adapatadocelu.MyViewHolderinfodato onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrecycle,parent,false);


        return new MyViewHolderinfodato(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapatadocelu.MyViewHolderinfodato holder, int position) {
        infodato infodato = celu.get(position);
        holder.txtnombre.setText(infodato.nombre);
       // holder.txtapellido.setText(infodato.apellido);
        //holder.ratingg.setText(infodato.rank);
    }

    @Override
    public int getItemCount() {
        return celu.size();
    }



    public class MyViewHolderinfodato extends RecyclerView.ViewHolder {

        TextView txtnombre;
       // TextView txtapellido;
       // TextView ratingg;



        public MyViewHolderinfodato(@NonNull View itemView) {
            super(itemView);


            txtnombre = itemView.findViewById(R.id.txtnombre1);
           // txtapellido = itemView.findViewById(R.id.txtapellido11);
           // ratingg = itemView.findViewById(R.id.ratingBar);


        }
    }
}
