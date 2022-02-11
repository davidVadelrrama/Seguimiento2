package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {

	
	private Recipe recipe;
	
	public void setupStage1() {
		
		recipe = new Recipe();
		
	}
	public void setupStage2() {
		
		recipe = new Recipe();
		recipe.addIngredient("cebolla", 315);
		recipe.addIngredient("ajo", 58);
		recipe.addIngredient("arroz", 520);
		
	}
	
	
	@Test
	void test1() {
		setupStage1();
		recipe.addIngredient("SAL", 12);
		
		//assert
		assertEquals(1, recipe.getIngredients().size());
	}
	@Test
	void test2() {
		setupStage2();
		recipe.addIngredient("pimienta", 6);
		
		Ingredient ultimo = recipe.getIngredients().get(recipe.getIngredients().size()-1);
		
		//assert
		assertEquals(4, recipe.getIngredients().size());
		assertEquals("pimienta", ultimo.getName());
		
	}
	
	@Test
	void test3() {
		setupStage2();
		recipe.addIngredient("ajo", 21);
		
		//assert
		
		
		
		
	}
	
	@Test
	void test4() {
		setupStage2();
		recipe.removeIngredient("ajo");
		
		//assert
		assertEquals(2, recipe.getIngredients().size());
		
		
		
	}
	
	
	
	

}
