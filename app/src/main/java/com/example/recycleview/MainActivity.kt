package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var item= listOf<ItemData>(
        ItemData(
            R.drawable.foiz,
            "Foiz Mahbub Soroj"
        ),
        ItemData(
            R.drawable.tayef,
            "Tayef F"
        ),
        ItemData(
            R.drawable.sourav,
            "Sourav F"
        ),
        ItemData(
            R.drawable.shimon_sir,
            "Sadek Bhuiya Shimon [Sir]"
        ),
        ItemData(
            R.drawable.rifat,
            "Rifat F"
        ),
        ItemData(
            R.drawable.sabbir,
            "shabbir F"
        ),
        ItemData(
            R.drawable.hasib,
            "Hasib"
        ),
        ItemData(
            R.drawable.bijay,
            "Bijoy F"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ad = Adapter(
            ItemData(
           item[0].image,
                item[0].name

            )
        )
        ad.submitList(item)

        binding.recyclerView.adapter = ad

    }
}