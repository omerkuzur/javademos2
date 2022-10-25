package dataAccess;

import entities.Categories;

public class JdbcCategoriesDao implements CategoriesDao{

	@Override
	public void add(Categories categories) {
		System.out.println("Kategori Jdbc ile veritabanýna eklendi");
		
	}
}
