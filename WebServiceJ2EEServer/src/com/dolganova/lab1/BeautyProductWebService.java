package com.dolganova.lab1;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService(serviceName = "BeautyProductService")
public class BeautyProductWebService {
    @Resource(lookup = "jdbc/mvideo")
    private DataSource dataSource;

    @WebMethod(operationName = "getBeautyProducts")
    public List<BeautyProduct> getBeautyProducts() {
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getBeautyProducts();
    }

    @WebMethod(operationName = "findBeautyProduct")
    public List<BeautyProduct> findBeautyProduct(String id, String name, String producingСountry, String vendorСode, String category, String price) {
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.findBeautyProduct(id, name, producingСountry, vendorСode, category, price);
    }

    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        }
        catch (SQLException ex) {
            Logger.getLogger(BeautyProductWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
