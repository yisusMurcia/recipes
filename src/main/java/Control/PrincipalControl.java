package Control;

import Model.*;

import java.util.ArrayList;

public class PrincipalControl {
    private final ArrayList<Recipe> recipes;
    private User user;
    private final UserControl userControl;

    public PrincipalControl() {
        new ViewControl(this);//Initialize view
        userControl = new UserControl();
        recipes = new ArrayList<>();

        //Crear algunas recetas
        // Receta 1
        recipes.add(new Recipe(
                "Tarta de Manzana",
                "1. Precalentar el horno a 180°C.\n2. Mezclar los ingredientes.\n3. Hornear por 45 minutos.",
                new String[]{"Manzanas", "Harina", "Azúcar", "Mantequilla", "Canela"},
                new FoodType[]{FoodType.SWEET},
                new FoodIntention[]{FoodIntention.SNACK, FoodIntention.DINNER},
                null
        ));

        // Receta 2
        recipes.add(new Recipe(
                "Ensalada César",
                "1. Lavar y cortar la lechuga.\n2. Añadir pollo, crutones y aderezo.\n3. Mezclar bien.",
                new String[]{"Lechuga", "Pollo", "Crutones", "Aderezo César", "Queso Parmesano"},
                new FoodType[]{FoodType.SAVORY},
                new FoodIntention[]{FoodIntention.HEALTHY, FoodIntention.LUNCH},
                null
        ));

        // Receta 3
        recipes.add(new Recipe(
                "Sopa Picante de Tomate",
                "1. Sofreír ajo y cebolla.\n2. Añadir tomates y caldo.\n3. Cocinar y licuar.",
                new String[]{"Tomates", "Ajo", "Cebolla", "Caldo de Verduras", "Chile"},
                new FoodType[]{FoodType.SPICY, FoodType.VEGAN},
                new FoodIntention[]{FoodIntention.DINNER},
                null
        ));

    }
    
    public User getUser() {
    	return user;
    }

    public UserControl getUserControl() {
        return userControl;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
