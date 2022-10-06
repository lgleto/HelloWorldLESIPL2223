package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /*
        var textViewHello = TextView(this)
        textViewHello.text = "Hello World!"
        textViewHello.textSize = 32.0f

        var buttonTranslate  = Button(this)
        buttonTranslate.text = "Translate"

        var linearLayout = LinearLayout(this)
        linearLayout.addView(textViewHello)
        linearLayout.addView(buttonTranslate)

        val onButtonTouch : ((View)->Unit)? = {
            val button = it as? Button

            button?.text = "Traduzir"
            textViewHello.text = "Olá mundo!"
        }

        buttonTranslate.setOnClickListener(onButtonTouch)

        setContentView(linearLayout)

         */

        setContentView(R.layout.activity_main)

        val textViewHello = findViewById<TextView>(R.id.textViewHello)
        val buttonTranslate = findViewById<Button>(R.id.buttonTrans)

        buttonTranslate.setOnClickListener{
            textViewHello.text = "Olá mundo!"
        }
    }
}