package View;

import Control.RecipeControl;
import Model.FoodIntention;
import Model.FoodType;
import Model.Recipe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RecipeView extends JFrame {
    private JPanel contentPane;
    private JTextField tfTitle;
    private JTextField tfInstructions;
    private JTextField tfIngredients;

    //Food intentions checkboxes
    private JCheckBox cbHealthy;
    private JCheckBox cbBreakfast;
    private JCheckBox cbLunch;
    private JCheckBox cbDinner;
    private JCheckBox cbSnack;

    //Food types checkboxes
    private JCheckBox cbSweet;
    private JCheckBox cbSavory;
    private JCheckBox cbSpicy;
    private JCheckBox cbSour;
    private JCheckBox cbBitter;
    private JCheckBox cbUmami;
    private JCheckBox cbVegan;

    private Recipe recipe;
    private final RecipeControl recipeControl;

    public RecipeView(RecipeControl recipeControl) {
        recipe = null;
        this.recipeControl = recipeControl;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
        gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JLabel lblTitleEdit = new JLabel("Editar receta");
        lblTitleEdit.setFont(new Font("Tahoma", Font.BOLD, 11));
        GridBagConstraints gbc_lblTitleEdit = new GridBagConstraints();
        gbc_lblTitleEdit.gridwidth = 2;
        gbc_lblTitleEdit.insets = new Insets(0, 0, 5, 5);
        gbc_lblTitleEdit.gridx = 1;
        gbc_lblTitleEdit.gridy = 1;
        contentPane.add(lblTitleEdit, gbc_lblTitleEdit);

        JLabel titleLbl = new JLabel("Título:");
        GridBagConstraints gbc_titleLbl = new GridBagConstraints();
        gbc_titleLbl.gridwidth = 2;
        gbc_titleLbl.insets = new Insets(0, 0, 5, 5);
        gbc_titleLbl.anchor = GridBagConstraints.WEST;
        gbc_titleLbl.gridx = 1;
        gbc_titleLbl.gridy = 2;
        contentPane.add(titleLbl, gbc_titleLbl);

        tfTitle = new JTextField();
        GridBagConstraints gbc_tfTitle = new GridBagConstraints();
        gbc_tfTitle.gridwidth = 2;
        gbc_tfTitle.insets = new Insets(0, 0, 5, 5);
        gbc_tfTitle.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfTitle.gridx = 1;
        gbc_tfTitle.gridy = 3;
        contentPane.add(tfTitle, gbc_tfTitle);
        tfTitle.setColumns(10);

        JLabel instructionsLbl = new JLabel("Instrucciones:");
        GridBagConstraints gbc_instructionsLbl = new GridBagConstraints();
        gbc_instructionsLbl.gridwidth = 2;
        gbc_instructionsLbl.anchor = GridBagConstraints.WEST;
        gbc_instructionsLbl.insets = new Insets(0, 0, 5, 5);
        gbc_instructionsLbl.gridx = 1;
        gbc_instructionsLbl.gridy = 4;
        contentPane.add(instructionsLbl, gbc_instructionsLbl);

        tfInstructions = new JTextField();
        tfInstructions.setColumns(10);
        GridBagConstraints gbc_tfInstructions = new GridBagConstraints();
        gbc_tfInstructions.gridwidth = 2;
        gbc_tfInstructions.insets = new Insets(0, 0, 5, 5);
        gbc_tfInstructions.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfInstructions.gridx = 1;
        gbc_tfInstructions.gridy = 5;
        contentPane.add(tfInstructions, gbc_tfInstructions);

        JLabel ingredientsLbl = new JLabel("Ingredientes (separar por comas(,)):");
        GridBagConstraints gbc_ingredientsLbl = new GridBagConstraints();
        gbc_ingredientsLbl.gridwidth = 2;
        gbc_ingredientsLbl.anchor = GridBagConstraints.WEST;
        gbc_ingredientsLbl.insets = new Insets(0, 0, 5, 5);
        gbc_ingredientsLbl.gridx = 1;
        gbc_ingredientsLbl.gridy = 6;
        contentPane.add(ingredientsLbl, gbc_ingredientsLbl);

        tfIngredients = new JTextField();
        tfIngredients.setColumns(10);
        GridBagConstraints gbc_tfIngredients = new GridBagConstraints();
        gbc_tfIngredients.gridwidth = 2;
        gbc_tfIngredients.insets = new Insets(0, 0, 5, 5);
        gbc_tfIngredients.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfIngredients.gridx = 1;
        gbc_tfIngredients.gridy = 7;
        contentPane.add(tfIngredients, gbc_tfIngredients);

        JLabel lblIntention = new JLabel("Intención de la comida:");
        GridBagConstraints gbc_lblIntention = new GridBagConstraints();
        gbc_lblIntention.gridwidth = 2;
        gbc_lblIntention.anchor = GridBagConstraints.WEST;
        gbc_lblIntention.insets = new Insets(0, 0, 5, 5);
        gbc_lblIntention.gridx = 1;
        gbc_lblIntention.gridy = 8;
        contentPane.add(lblIntention, gbc_lblIntention);

        JPanel panel = new JPanel();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.gridwidth = 2;
        gbc_panel.insets = new Insets(0, 0, 5, 5);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 9;
        contentPane.add(panel, gbc_panel);

        cbHealthy = new JCheckBox("Saludable");
        panel.add(cbHealthy);

        cbBreakfast = new JCheckBox("Desayuno");
        panel.add(cbBreakfast);

        cbLunch = new JCheckBox("Almuerzo");
        panel.add(cbLunch);

        cbDinner = new JCheckBox("Cena");
        panel.add(cbDinner);

        cbSnack = new JCheckBox("Snack");
        panel.add(cbSnack);

        JLabel typeLbl = new JLabel("Tipo de comida:");
        GridBagConstraints gbc_typeLbl = new GridBagConstraints();
        gbc_typeLbl.gridwidth = 2;
        gbc_typeLbl.anchor = GridBagConstraints.WEST;
        gbc_typeLbl.insets = new Insets(0, 0, 5, 5);
        gbc_typeLbl.gridx = 1;
        gbc_typeLbl.gridy = 10;
        contentPane.add(typeLbl, gbc_typeLbl);

        JPanel panel_1 = new JPanel();
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.gridwidth = 2;
        gbc_panel_1.insets = new Insets(0, 0, 5, 5);
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 1;
        gbc_panel_1.gridy = 11;
        contentPane.add(panel_1, gbc_panel_1);

        cbSweet = new JCheckBox("Dulce");
        panel_1.add(cbSweet);

        cbSavory = new JCheckBox("Salado");
        panel_1.add(cbSavory);

        cbSpicy = new JCheckBox("Picante");
        panel_1.add(cbSpicy);

        cbSour = new JCheckBox("Ácido");
        panel_1.add(cbSour);

        cbBitter = new JCheckBox("Amargo");
        panel_1.add(cbBitter);

        cbUmami = new JCheckBox("Umami");
        panel_1.add(cbUmami);

        cbVegan = new JCheckBox("Vegano");
        panel_1.add(cbVegan);

        JButton acceptBtn = new JButton("Aceptar");
        acceptBtn.setActionCommand("finish");
        acceptBtn.addActionListener(recipeControl);

        GridBagConstraints gbc_acceptBtn = new GridBagConstraints();
        gbc_acceptBtn.insets = new Insets(0, 0, 5, 5);
        gbc_acceptBtn.gridx = 1;
        gbc_acceptBtn.gridy = 13;
        contentPane.add(acceptBtn, gbc_acceptBtn);

        JButton deleteBtn = new JButton("Borrar");
        deleteBtn.setActionCommand("delete");
        deleteBtn.addActionListener(recipeControl);

        GridBagConstraints gbc_deleteBtn = new GridBagConstraints();
        gbc_deleteBtn.insets = new Insets(0, 0, 5, 5);
        gbc_deleteBtn.gridx = 2;
        gbc_deleteBtn.gridy = 13;
        contentPane.add(deleteBtn, gbc_deleteBtn);
        setVisible(true);
    }

    public void loadRecipeData(Recipe recipe){
        this.recipe = recipe;
        tfTitle.setText(recipe.getTitle());
        tfInstructions.setText(recipe.getInstructions());
        tfIngredients.setText(String.join(", ", recipe.getIngredients()));
        // Load food types and intentions checkboxes based on the recipe data
        for(FoodIntention foodIntention : recipe.getFoodIntentions()){
            JCheckBox option = null;
            switch (foodIntention){
                case HEALTHY:
                    option = cbHealthy;
                    break;
                case LUNCH:
                    option = cbLunch;
                    break;
                case DINNER:
                    option = cbDinner;
                    break;
                case BREAKFAST:
                    option = cbBreakfast;
                    break;
                case SNACK:
                    option = cbSnack;
                    break;
            }
            if(option != null){
                option.setSelected(true);
            }
        }
        // Load food types checkboxes based on the recipe data
        for(FoodType foodType : recipe.getFoodType()){
            JCheckBox option = null;
            switch (foodType){
                case SWEET:
                    option = cbSweet;
                    break;
                case SAVORY:
                    option = cbSavory;
                    break;
                case SPICY:
                    option = cbSpicy;
                    break;
                case SOUR:
                    option = cbSour;
                    break;
                case BITTER:
                    option = cbBitter;
                    break;
                case UMAMI:
                    option = cbUmami;
                    break;
                case VEGAN:
                    option = cbVegan;
                    break;
            }
            if(option != null){
                option.setSelected(true);
            }
        }
    }

    public JTextField getTfTitle() {
        return tfTitle;
    }

    public JTextField getTfInstructions() {
        return tfInstructions;
    }

    public JTextField getTfIngredients() {
        return tfIngredients;
    }

    public JCheckBox getCbHealthy() {
        return cbHealthy;
    }

    public JCheckBox getCbBreakfast() {
        return cbBreakfast;
    }

    public JCheckBox getCbLunch() {
        return cbLunch;
    }

    public JCheckBox getCbDinner() {
        return cbDinner;
    }

    public JCheckBox getCbSnack() {
        return cbSnack;
    }

    public JCheckBox getCbSweet() {
        return cbSweet;
    }

    public JCheckBox getCbSavory() {
        return cbSavory;
    }

    public JCheckBox getCbSpicy() {
        return cbSpicy;
    }

    public JCheckBox getCbSour() {
        return cbSour;
    }

    public JCheckBox getCbBitter() {
        return cbBitter;
    }

    public JCheckBox getCbUmami() {
        return cbUmami;
    }

    public FoodType[] getFoodType(){
        ArrayList<FoodType> foodTypes = new ArrayList<>();

        //Check every combobox
        if(getCbBitter().isSelected()){
            foodTypes.add(FoodType.BITTER);
        }
        if(getCbSweet().isSelected()){
            foodTypes.add(FoodType.SWEET);
        }
        if(getCbSour().isSelected()){
            foodTypes.add(FoodType.SOUR);
        }
        if(getCbSavory().isSelected()){
            foodTypes.add(FoodType.SAVORY);
        }
        if (getCbSpicy().isSelected()){
            foodTypes.add(FoodType.SPICY);
        }
        if(getCbUmami().isSelected()){
            foodTypes.add(FoodType.UMAMI);
        }
        FoodType[] foodTypesArray = new FoodType[foodTypes.size()];
        for (int i = 0; i < foodTypes.size(); i++) {
            foodTypesArray[i] = foodTypes.get(i);
        }
        return foodTypesArray;

    }

    public FoodIntention[] getFoodIntention(){
        ArrayList<FoodIntention> foodIntentions = new ArrayList<>();

        //Check every combobox
        if(getCbBreakfast().isSelected()){
            foodIntentions.add(FoodIntention.BREAKFAST);
        }
        if(getCbLunch().isSelected()){
            foodIntentions.add(FoodIntention.LUNCH);
        }
        if(getCbDinner().isSelected()){
            foodIntentions.add(FoodIntention.DINNER);
        }
        if(getCbSnack().isSelected()){
            foodIntentions.add(FoodIntention.SNACK);
        }
        if(getCbHealthy().isSelected()){
            foodIntentions.add(FoodIntention.HEALTHY);
        }

        FoodIntention [] foodIntentionsArray = new FoodIntention[foodIntentions.size()];
        for (int i = 0; i < foodIntentions.size(); i++) {
            foodIntentionsArray[i] = foodIntentions.get(i);
        }
        return foodIntentionsArray;

    }

    public Recipe getRecipeUpdated(){
        recipe = new Recipe(tfTitle.getText(), tfInstructions.getText(), tfIngredients.getText().split(","), getFoodType(), getFoodIntention(), recipeControl.getControlPanel().getViewControl().getPrincipalControl().getUser());
        return recipe;
    }
}