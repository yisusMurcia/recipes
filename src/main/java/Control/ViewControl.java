package Control;

import View.MainView;
import View.PrincipalView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl pControl;
    private final MainView mainView;
    private static int contador = 0;

    public ViewControl(PrincipalControl pControl) {
        this.pControl = pControl;
        //Create MainView
        mainView = new MainView(this);
    }

    public PrincipalControl getpControl() {
        return pControl;
    }

    public void createMYAccount(){
        new PrincipalView(this, pControl.getUser());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LoginControl loginControl = new LoginControl(this);
        mainView.dispose();
        switch (e.getActionCommand()) {
            case "login":
                loginControl.createLoginView();
                break;
            case "register":
                loginControl.createNewUserView();
                break;
            default:
                mainView.alertBrokenSystem();
                break;
        }
    }
    /*
    public void funcBtnNext() {
    	myAccount.getBtnNext().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador += 1;
				myAccount.getLblInstrucciones().setText("");
				myAccount.getTpIngredientes().setText("");
				myAccount.getLblInstrucciones().setText("Instrucciones: " + pControl.getUser().getRecipes().get(contador).getInstructions());
				String ingredientes = myAccount.getTpIngredientes().getText();
				myAccount.getTpIngredientes().setText(ingredientes + pControl.getUser().getRecipes().get(contador).getIngredients().get(0) + "\n");
				for (int i=1; i<=2; i++) {
					ingredientes = myAccount.getTpIngredientes().getText();
					myAccount.getTpIngredientes().setText(ingredientes + "\n" + pControl.getUser().getRecipes().get(contador).getIngredients().get(i) + "\n");
				}
			}
		});
    }*/
}
