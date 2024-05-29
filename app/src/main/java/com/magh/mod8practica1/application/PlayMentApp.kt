package com.magh.mod8practica1.application

import android.app.Application
import com.magh.mod8practica1.data.PlayMentRepository
import com.magh.mod8practica1.data.remote.RetrofitHelper

class PlayMentApp: Application() {

    private val retrofit by lazy{
        RetrofitHelper().getRetrofit()
    }

    val repository by lazy {
        PlayMentRepository(retrofit)
    }

}