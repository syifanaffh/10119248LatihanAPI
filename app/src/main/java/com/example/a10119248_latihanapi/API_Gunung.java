package com.example.a10119248_latihanapi;


// Syifa Nur Afifah - 10119248 - IF 6
// Tanggal Pengerjaan : 11-15 Juli 2022

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Gunung {
    @GET("/api/volcanoes")
    Call<List<Post>> getPost();
}