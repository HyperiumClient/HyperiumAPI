package cc.hyperium.api.examples;

import cc.hyperium.api.HyperiumAPI;
import cc.hyperium.api.entities.Package;
import cc.hyperium.api.requests.PurchasesRequest;
import cc.hyperium.api.responses.PurchasesResponse;

public class APIExample {
    public static void main(String... args) {
        HyperiumAPI api = new HyperiumAPI();
        PurchasesRequest purchases = new PurchasesRequest("Cubxity");
        PurchasesResponse purchasesResponse = (PurchasesResponse) api.request(purchases);
        for(Package p : purchasesResponse.getPackages())
            System.out.println(p);
    }
}
