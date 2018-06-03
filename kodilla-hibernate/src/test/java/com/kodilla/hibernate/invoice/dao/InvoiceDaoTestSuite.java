package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

//        Given
        Product product = new Product("produkt");
        Product product1 = new Product("produkt 1");
        Product product2 = new Product("produkt 2");

        Item item1 = new Item(new BigDecimal(34),2,new BigDecimal(56));
        Item item2 = new Item(new BigDecimal(12),1, new BigDecimal(24));
        Item item3 = new Item(new BigDecimal(11),3,new BigDecimal(23));

        item1.setProduct(product);
        item2.setProduct(product1);
        item3.setProduct(product2);

        Invoice invoice = new Invoice("invoice number 1");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

//        When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

//        Then
        Assert.assertNotEquals(0,invoiceId);

//        CleanUp
//        invoiceDao.delete(invoiceId);

    }
}
