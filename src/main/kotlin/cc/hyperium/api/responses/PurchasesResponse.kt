package cc.hyperium.api.responses

import cc.hyperium.api.entities.Package
import cc.hyperium.api.requests.PurchasesRequest

class PurchasesResponse(r: PurchasesRequest, pack: Array<Package>) : APIResponse<PurchasesRequest>(r){
    var packages: Array<Package> = pack
}
