package com.dzakyhdr.week1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Person(
    val name: String,
    val address: String
): Parcelable
