package Iterator;

import Iterator.Model.Catalog;
import Iterator.Model.Seller;

public class IteratorMain {

    public static void main(String[] args) {

        Catalog devStoreCatalog = new DevStoreCatalog();
        Catalog geekyStoreCatalog = new DevStoreCatalog();

        Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
        seller.printCatalog();

    }
}
