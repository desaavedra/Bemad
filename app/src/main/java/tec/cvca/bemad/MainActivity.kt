package tec.cvca.bemad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import tec.cvca.bemad.elemento.adapter.Adapter1
import tec.cvca.bemad.elemento.model.Element

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos = arrayListOf(
            Element("Farmacia los perros", "Farmacia",3,R.drawable.farmacia),
            Element("PizzaHut", "Comida",4,R.drawable.pizzahut),
            Element("Sears", "Tienda",5,R.drawable.sears),
            Element("Subway", "Comida",2,R.drawable.subway)

        )
        val adaptador = Adapter1(this,R.layout.layout_element,datos)
        lvlLista.adapter = adaptador

    }
}
