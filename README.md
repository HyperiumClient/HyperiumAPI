# Hyperium API
Hyperium's API Wrapper, Made in Kotlin by Cubxity

# Usage
**Getting Purchases**
```java
HyperiumAPI api = new HyperiumAPI();
        PurchasesRequest purchases = new PurchasesRequest("Cubxity");
        PurchasesResponse purchasesResponse = (PurchasesResponse) api.request(purchases);
        for(Package p : purchasesResponse.getPackages())
            System.out.println(p);
```
