package com.dolganova.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/beautyProducts")
@Produces({MediaType.APPLICATION_JSON})
public class BeautyProductResource {

    @GET
    public List<BeautyProduct> getBeautyProducts(@QueryParam("id") String id,
                                                 @QueryParam("name") String name,
                                                 @QueryParam("producingCountry") String producingCountry,
                                                 @QueryParam("vendorCode") String vendorCode,
                                                 @QueryParam("category") String category,
                                                 @QueryParam("price") String price)
    {
        if ((id == null || id.isEmpty()) &&
                (name == null || name.isEmpty()) &&
                (producingCountry == null || producingCountry.isEmpty()) &&
                (vendorCode == null || vendorCode.isEmpty()) &&
                (category == null || category.isEmpty())&&
                (price == null || price.isEmpty())) {
            List<BeautyProduct> beautyProducts = new PostgreSQLDAO().getBeautyProducts();
            return beautyProducts;
        }

        id = (id == null) ? new String() : id;
        name = (name == null) ? new String() : name;
        producingCountry = (producingCountry == null) ? new String() : producingCountry;
        vendorCode = (vendorCode == null) ? new String() : vendorCode;
        price = (price == null) ? new String() : price;

        List<BeautyProduct> beautyProducts = new PostgreSQLDAO().findBeautyProduct(id, name, producingCountry, vendorCode, category, price);
        return beautyProducts;
    }


}
