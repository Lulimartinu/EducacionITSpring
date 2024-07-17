
--Productos
INSERT INTO PRODUCT (id, name, price ) values (1, 'Mouse Dragon xyz', 10000);
INSERT INTO PRODUCT (id, name, price ) values (2, 'Teclado Dragon xyz', 20000)


--Facturas
INSERT INTO INVOICE (id) values (1);
INSERT INTO INVOICE (id) values (2);


--Detalles
INSERT INTO INVOICE_DETAIL (id, INVOICE_ID , PRODUCT_ID, QUANTITY) values (1,1,1, 3);
INSERT INTO INVOICE_DETAIL (id, INVOICE_ID , PRODUCT_ID, QUANTITY) values (2,2,2, 1 );
