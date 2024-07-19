package educacionit.clase2.service.impl;

import educacionit.clase2.entity.Category;
import educacionit.clase2.repository.CategoryRepository;
import educacionit.clase2.service.ICategoryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Log4j2
@Service
public class CategoryService implements ICategoryService
{
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> findAllCategories() {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("El metdo findAllCategories se ejecuto : " + date);
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("El metdo findById se ejecuto : " + date);
        return categoryRepository.findById(id).orElse(null);
    }
}
