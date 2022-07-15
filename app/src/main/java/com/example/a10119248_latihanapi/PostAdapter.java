package com.example.a10119248_latihanapi;

// Syifa Nur Afifah - 10119248 - IF 6
// Tanggal Pengerjaan : 11-15 Juli 2022

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    List<Post> postList;
    Context context;

    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.nama.setText("Nama Gunung = " + post.getNama());
        holder.bentuk.setText("Bentuk Gunung = " + post.getBentuk());
        holder.tinggi_meter.setText("Tinggi Gunung = " + post.getTinggi_meter());
        holder.estimasi_letusan_terakhir.setText("Perkiraan Terkahir Meletus = " + post.getEstimasi_letusan_terakhir());
        holder.geolokasi.setText("Lokasi Gunung = " + post.getGeolokasi());

    }
    @Override
    public int getItemCount() {
        return postList.size();
    }


    public class  PostViewHolder extends RecyclerView.ViewHolder{
        TextView nama, bentuk, tinggi_meter, estimasi_letusan_terakhir, geolokasi;
        public PostViewHolder(@NonNull View itemView)  {
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            bentuk = itemView.findViewById(R.id.bentuk);
            tinggi_meter = itemView.findViewById(R.id.tinggi_meter);
            estimasi_letusan_terakhir = itemView.findViewById(R.id.estimasi_letusan_terakhir);
            geolokasi = itemView.findViewById(R.id.geolokasi);
        }
    }
}
