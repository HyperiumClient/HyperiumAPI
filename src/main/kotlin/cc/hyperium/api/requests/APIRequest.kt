package cc.hyperium.api.requests

import cc.hyperium.api.HyperiumAPI
import cc.hyperium.api.responses.APIResponse

abstract class APIRequest<out T> {
    abstract fun request(hyperiumAPI: HyperiumAPI) : APIResponse<T>
}