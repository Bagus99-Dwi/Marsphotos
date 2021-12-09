package com.bagus.marsphotos.network
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

    private const val BASE_URL =
        "https://android-kotlin-fun-mars-server.appspot.com"
    private val retrofit = Retrofit.Builder()
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
class MarsApiService {
    fun getPhotos(): Any {

    }

    interface MarsApiService {
        @GET("photos")
        suspend fun getPhotos(): String
    }
}
object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java) }
}