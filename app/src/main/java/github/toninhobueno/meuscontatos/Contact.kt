package github.toninhobueno.meuscontatos


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contact (

    var name : String,
    var fone : String,
    var photograph : String,

    ): Parcelable