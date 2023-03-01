package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofit.domain.PostItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = RetrofitClient.createPostService()
        val call: Call<List<PostItem>> = service.list()

        call.enqueue(object: Callback<List<PostItem>>{
            override fun onResponse(call: Call<List<PostItem>>,response: Response<List<PostItem>>){
                val  s = "s"
            }

            override fun onFailure(call: Call<List<PostItem>>, t: Throwable) {
                val  s = "s"
            }
        })

    }

}