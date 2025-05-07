package Control;

import View.MainView;
import View.MyAccount;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    private final PrincipalControl pControl;
    private final MainView mainView;
    private final MyAccount myAccount;
    private static int contador = 0;

    public ViewControl(PrincipalControl pControl) {
        this.pControl = pControl;
        //Create MainView
        mainView = new MainView(this);
        myAccount = new MyAccount(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "loggin":
                new LoginControl(this);
                break;
            case "register":
                new RegisterControl(this);
                break;
            default:
                mainView.alertBrokenSystem();
                break;
        }
    }
    
    public void funcBtnNext() {
    	myAccount.getBtnNext().addActionListener(new ActionListener() {
			// Trabajar con el control
			public void actionPerformed(ActionEvent e) {
				contador += 1;
				myAccount.getLblInstrucciones().setText("");
				myAccount.getTpIngredientes().setText("");
				myAccount.getLblInstrucciones().setText("Instrucciones: " + pControl.getUser().getRecipes().get(contador).getInstructions());
				String ingredientes = myAccount.getTpIngredientes().getText();
				myAccount.getTpIngredientes().setText(ingredientes + user.getRecipes().get(contador).getIngredients().get(0) + "\n");
				for (int i=1; i<=2; i++) {
					ingredientes = myAccount.getTpIngredientes().getText();
					myAccount.getTpIngredientes().setText(ingredientes + "\n" + user.getRecipes().get(contador).getIngredients().get(i) + "\n");
				}
			}
		});
    }
}
