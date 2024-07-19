package educacionit.clase2.service;

import educacionit.clase2.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAllProducts();
    List<Product> productFiltered(Long categoryId);


}
