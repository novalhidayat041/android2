package id.ac.polbeng.jasaonline.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(
    @SerializedName("id")
    var id: Int =0,
    @SerializedName("nama")
    var nama: String? = null,
    @SerializedName("tanggal_lahir")
    var tanggalLahir:String? = null,
    @SerializedName("jenis_kelamin")
    var jenisKelamin:String? = null,
    @SerializedName("nomor_hp")
    var nomorHP:String? = null,
    @SerializedName("ALAMAT")
    var alamat: String? = null,
    @SerializedName("EMAIL")
    var email: String? = null,
    @SerializedName("password")
    var password: String? = null
) : Serializable


