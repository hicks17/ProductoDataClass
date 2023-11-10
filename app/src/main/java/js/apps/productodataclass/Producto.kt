package js.apps.productodataclass

import java.io.Serializable


data class Producto(
    val nombre:String,
    val precio:Int,
    val id:String,
    val desc:String
) : Serializable


