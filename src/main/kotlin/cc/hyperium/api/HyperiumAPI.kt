package cc.hyperium.api

import cc.hyperium.api.requests.APIRequest
import cc.hyperium.api.responses.APIResponse
import okhttp3.OkHttpClient

class HyperiumAPI{
    private val client: OkHttpClient = OkHttpClient()
    fun <T> request (request: APIRequest<T>) : APIResponse<T>{
        return request.request(this)
    }
}