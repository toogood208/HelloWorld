package hfad.com.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun incrementButton(view: View){

        val inc= findViewById<TextView>(R.id.increment_view)

        // convet from unit to string then to int
        var counter:Int =  inc.text.toString().toInt()

        // increment the text
        counter++

        // set it back to the view
        inc.text = counter.toString()

    }
}