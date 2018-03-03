package cc.hyperium.api.requests

import cc.hyperium.api.APIException
import cc.hyperium.api.HyperiumAPI
import cc.hyperium.api.entities.Package
import cc.hyperium.api.responses.APIResponse
import cc.hyperium.api.responses.PurchasesResponse
import com.google.gson.JsonParser
import okhttp3.Request

class PurchasesRequest(private val ign: String) : APIRequest<PurchasesRequest>() {
    override fun request(hyperiumAPI: HyperiumAPI): APIResponse<PurchasesRequest>{
        val request = Request.Builder()
                .url(hyperiumAPI.apiBase+"purchases/"+ign)
                .build()
        val response = hyperiumAPI.client.newCall(request).execute()
        val json = JsonParser().parse(response.body()!!.string()).asJsonObject
        if(!json.get("success").asBoolean)
            throw APIException("Request failed, Cause: ${json.get("cause")}")
        val packages: Array<cc.hyperium.api.entities.Package> = emptyArray()
        json.get("packages").asJsonArray
                .map { it.asInt }
                .forEach { packages.plus(fromId(it)) }
        return PurchasesResponse(this, packages)
    }

    private fun fromId(id: Int) : cc.hyperium.api.entities.Package {
        for(p in Package.values())
            if(p.id == id)
                return p
        throw APIException("Unknown Package")
    }

}