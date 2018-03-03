package cc.hyperium.api

import cc.hyperium.api.requests.APIRequest
import cc.hyperium.api.responses.APIResponse
import okhttp3.OkHttpClient

@Suppress("unused")
class HyperiumAPI{
    val client: OkHttpClient = OkHttpClient()
    val apiBase = "https://api.hyperium.cc/"
    fun <T> request (request: APIRequest<T>) : APIResponse<T>{
        return request.request(this)
    }
}