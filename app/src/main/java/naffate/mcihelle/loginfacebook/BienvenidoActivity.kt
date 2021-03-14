package naffate.mcihelle.loginfacebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        var tv_nombre = findViewById(R.id.nombre) as TextView
        var Bundle = intent.extras

        if (Bundle != null){
            var nombre = Bundle.getString("nombre")
            var apellido= Bundle.getString("apellido")

            tv_nombre.setText("$nombre $apellido")
        }

    }
}