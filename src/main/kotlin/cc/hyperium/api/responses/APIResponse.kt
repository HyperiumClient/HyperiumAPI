package cc.hyperium.api.responses

abstract class APIResponse<out T>(private var r: T){
    fun getRequest() : T{
        return r
    }
}