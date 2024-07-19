--Categorias
INSERT INTO CATEGORY (id, name) values (1, 'mouse');
INSERT INTO CATEGORY (id, name) values (2,'teclado')


--Productos
--mouses categoria 1
INSERT INTO PRODUCT (id, name, price, image, category_id) values (1, 'Mouse Dragon xyz', 100000, 'mouse1.jpg', 1);
INSERT INTO PRODUCT (id, name, price, image, category_id) values (2, 'Mouse Dragon buble', 200000, 'mouse2.jpg', 1);


--teclados categoria 2
INSERT INTO PRODUCT (id, name, price, image, category_id) values (3, 'teclado numero 1', 800000, 'teclado1.jpg', 2);

INSERT INTO PRODUCT (id, name, price, image, category_id) values (4, 'teclado led retro iluminado', 500000, 'teclado2.jpg', 2);




--Facturas
INSERT INTO INVOICE (id) values (1);
INSERT INTO INVOICE (id) values (2);
INSERT INTO INVOICE (id) values (3);
INSERT INTO INVOICE (id) values (4);


--Detalles

INSERT INTO INVOICE_DETAIL (id, INVOICE_ID , PRODUCT_ID, QUANTITY) values (1,2,1, 1 );
INSERT INTO INVOICE_DETAIL (id, INVOICE_ID , PRODUCT_ID, QUANTITY) values (2,2,2, 1 );

INSERT INTO INVOICE_DETAIL (id, INVOICE_ID , PRODUCT_ID, QUANTITY) values (3,2,3, 1 );

INSERT INTO INVOICE_DETAIL (id, INVOICE_ID , PRODUCT_ID, QUANTITY) values (4,2,4, 1 );








