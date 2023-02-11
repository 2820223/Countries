package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var index = 0
    var imgArray: MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var right = findViewById<ImageView>(R.id.right)
        var main = findViewById<ImageView>(R.id.main)
        var img1 = findViewById<ImageView>(R.id.img1)
        var left = findViewById<ImageView>(R.id.left)


        imgArray.add(R.drawable.bir)
        imgArray.add(R.drawable.ikki)
        imgArray.add(R.drawable.uch)
        imgArray.add(R.drawable.tort)
        imgArray.add(R.drawable.besh)
        imgArray.add(R.drawable.olti)

img1.setOnClickListener {
    main.setImageResource(imgArray[index])

}
        right.setOnClickListener {

            if (index < imgArray.size - 1) {
                index++
            } else {
                index = 0
            }
            main.setImageResource(imgArray[index])


        }

        left.setOnClickListener {
            if (index <= imgArray.size - 1) {
                index--
            }
            else {
                index = imgArray.size-2
            }
            main.setImageResource(imgArray[index])

        }



    }
}
