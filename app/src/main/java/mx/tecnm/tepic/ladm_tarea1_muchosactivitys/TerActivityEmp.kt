package mx.tecnm.tepic.ladm_tarea1_muchosactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_ter_emp.*

class TerActivityEmp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ter_emp)
     actualizar.setOnClickListener {
     AlertDialog.Builder(this).setTitle("AVISO").setMessage("ACTUALIZADO CORRECTAMENTE").setPositiveButton("Ok",{d,i->}).show()
     }
        horario.setOnClickListener {
            abrirHora()

        }

    }

    private fun abrirHora() {
        val hora= Intent(this,SegActivityBasic::class.java)
        startActivity(hora)
    }
}