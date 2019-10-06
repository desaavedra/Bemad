package tec.cvca.bemad.elemento.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import tec.cvca.bemad.R
import tec.cvca.bemad.elemento.model.Element

class Adapter1(private val context: Context, private val layout: Int,
               private val dataSource: List<Element>) : BaseAdapter()
{
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View
    {
        val view = inflater.inflate(layout, p2, false)
        val imgElemento = view.findViewById<ImageView>(R.id.imgImagen)
        val txtNombre = view.findViewById<TextView>(R.id.txvNombre)
        val txvNegocio = view.findViewById<TextView>(R.id.txvTipoNegocio)
        val txvPuntaje = view.findViewById<TextView>(R.id.txvPuntaje)


        val elemento = getItem(p0) as Element

        imgElemento.setImageResource(elemento.imagen)
        txtNombre.setText(elemento.nombre)
        txvNegocio.setText(elemento.tipoNegocio)
        txvPuntaje.setText(elemento.puntaje)


        return view
    }

    override fun getItem(p0: Int): Any {
        return dataSource[p0]
    }


    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return dataSource.size
    }
}