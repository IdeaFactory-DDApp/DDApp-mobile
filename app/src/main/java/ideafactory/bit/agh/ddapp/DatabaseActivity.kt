package ideafactory.bit.agh.ddapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_knowledge.*
import java.util.*

class DatabaseActivity : AppCompatActivity() {


    var currentInformationIndex =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }



        val informationArray = getResources().getStringArray(R.array.information_array)

        val textView: TextView = findViewById(R.id.information_view) as TextView

        var firstRandomInformation = Random().nextInt(informationArray.size)
        textView.text = informationArray[firstRandomInformation]
        textView.setOnClickListener {

            textView.text = informationArray[currentInformationIndex]
            currentInformationIndex=(currentInformationIndex+1)%informationArray.size
        }
    }

}
