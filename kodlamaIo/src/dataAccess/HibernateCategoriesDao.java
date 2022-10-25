package dataAccess;

import entities.Categories;

public class HibernateCategoriesDao implements CategoriesDao{

	@Override
	public void add(Categories categories) {
		System.out.println("kategori hibernate ile veritabanýna eklendi");
		
	}
}
