package educacionit.clase2.service.impl;

import educacionit.clase2.entity.Product;
import educacionit.clase2.repository.ProductRepository;
import educacionit.clase2.service.IProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Log4j2
@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> productFiltered(Long categoryId) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
          log.info("El metdo findById se ejecuto : " + date);
        List<Product> products = findAllProducts();
        List<Product> productFiltered = new ArrayList<>();
        if(categoryId != null && categoryId > 0){
            products.forEach(item -> {
                if(item.getCategory().getId().equals(categoryId)){
                    productFiltered.add(item);
                }
            });
        }else{
            productFiltered.addAll(products);
        }
        return productFiltered;
    }



}
