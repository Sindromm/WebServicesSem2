package com.dolganova.lab1;

/**
 * Created by Polina on 23.02.19.
 */

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "BeautyProductService")
public class BeautyProductWebService {

    @WebMethod(operationName = "getBeautyProducts")
    public List<BeautyProduct> getBeautyProducts() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<BeautyProduct> beautyProducts = dao.getBeautyProducts();
        return beautyProducts;
    }

    @WebMethod(operationName = "insertBeautyProduct")
    public Integer insertBeautyProduct(String name, String producingСountry, String vendorСode, String category, String price) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        Integer beautyProductId = dao.insertBeautyProduct(name, producingСountry, vendorСode, category, price);
        return beautyProductId;
    }

    @WebMethod(operationName = "updateBeautyProduct")
    public String updateBeautyProduct(String id, String name, String producingСountry, String vendorСode, String category, String price) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        String status = dao.updateBeautyProduct(id, name, producingСountry, vendorСode, category, price) ;
        return status;
    }

    @WebMethod(operationName = "deleteBeautyProduct")
    public String deleteBeautyProduct(String id) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        String status = dao.deleteBeautyProduct(id) ;
        return status;
    }

    @WebMethod(operationName = "findBeautyProduct")
    public List<BeautyProduct> findBeautyProduct(String id, String name, String producingСountry, String vendorСode, String category, String price) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<BeautyProduct> beautyProducts = dao.findBeautyProduct(id, name, producingСountry, vendorСode, category, price) ;
        return beautyProducts;
    }

}
