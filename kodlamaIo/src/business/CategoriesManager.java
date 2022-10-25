package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CategoriesDao;
import entities.Categories;

public class CategoriesManager {

	private CategoriesDao categoriesDao;
	private Logger[] logger;
	private List<Categories> categories;

	public CategoriesManager(CategoriesDao categoriesDao, Logger[] logger) {
		this.categoriesDao = categoriesDao;
		this.logger = logger;
		this.categories = new ArrayList<>();
	}

	public void add(Categories categories1) throws Exception {
		for (Categories categoryA : categories) {
			if (categories1.getCategory().equals(categories1.getCategory())) {
				throw new Exception("Kategori ismi ayný olamaz");
			}
			categoriesDao.add(categories1);
			for (Logger logger : logger) {
				logger.log(categories1.getCategory());
			}

		}
	}
}