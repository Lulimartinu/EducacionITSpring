package educacionit.clase2.controller;


import educacionit.clase2.entity.Category;
import educacionit.clase2.entity.Product;
import educacionit.clase2.service.ICategoryService;
import educacionit.clase2.service.IProductService;
import educacionit.clase2.service.impl.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IProductService productService;

    @GetMapping
    public String getProducts(@RequestParam(value = "categoryId", required = false) Long categoryId, Model model) {
        List<Category> categories = categoryService.findAllCategories();
        List<Product> products = productService.productFiltered(categoryId);
        model.addAttribute("categories", categories);
        model.addAttribute("products", products);
        model.addAttribute("selectedCategoryId", categoryId);
        return "productos";
    }

}
