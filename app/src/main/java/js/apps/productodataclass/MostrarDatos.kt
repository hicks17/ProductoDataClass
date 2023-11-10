package js.apps.productodataclass

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import js.apps.productodataclass.databinding.ActivityMostrarDatosBinding

class MostrarDatos : AppCompatActivity() {
    private lateinit var binding: ActivityMostrarDatosBinding
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostrarDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val user = intent.getSerializableExtra("producto") as Producto

        binding.tvProducto.text = user.nombre
        binding.tvId.text = user.id
        binding.tvDesc.text = user.desc
        binding.tvPrecio.text = user.precio.toString()



    }
}