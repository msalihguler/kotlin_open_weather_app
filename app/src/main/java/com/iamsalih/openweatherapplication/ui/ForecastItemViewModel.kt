package com.iamsalih.openweatherapplication.ui

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by muhammedsalihguler on 30.07.17.
 */
data class ForecastItemViewModel(val degreeDay : String?,
                                 val icon : String = "01d",
                                 val date : Long = System.currentTimeMillis(),
                                 val description: String = "No description",
                                 val minimumDegree : String?,
                                 val maximumDegree : String?,
                                 val pressure : String?,
                                 val humidity : String?,
                                 val cityName : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readLong(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(degreeDay)
        parcel.writeString(icon)
        parcel.writeLong(date)
        parcel.writeString(description)
        parcel.writeString(minimumDegree)
        parcel.writeString(maximumDegree)
        parcel.writeString(pressure)
        parcel.writeString(humidity)
        parcel.writeString(cityName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ForecastItemViewModel> {
        override fun createFromParcel(parcel: Parcel): ForecastItemViewModel {
            return ForecastItemViewModel(parcel)
        }

        override fun newArray(size: Int): Array<ForecastItemViewModel?> {
            return arrayOfNulls(size)
        }
    }

}