package com.vapasi.factory;

import static com.vapasi.factory.WebsiteType.BLOG;
import static com.vapasi.factory.WebsiteType.SHOP;

public class FactoryDemo {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(BLOG);

        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(SHOP);

        System.out.println(website.getPages());
    }
}
