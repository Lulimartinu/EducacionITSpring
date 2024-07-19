package educacionit.clase2.service;

import educacionit.clase2.entity.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAllCategories();

    Category findById(Long id);
}
