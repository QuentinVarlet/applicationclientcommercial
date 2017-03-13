/**
 * Your application code goes here<br>
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */


package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.table.Table;
import com.codename1.ui.util.Resources;
import com.codename1.xml.Element;
import userclasses.util.modele.ModeleDeTableau;
import userclasses.util.parser.RequetePourArbreXML;
import userclasses.util.parser.RequetePourTexteBrut;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    
    private RequetePourTexteBrut requeteRestConnexion;
    private RequetePourArbreXML requeteRestCommande;
    private Element eltCommande;
    private String cx;
    private Table tableau;
    private ModeleDeTableau modeleDuTableau; 
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
        
        
    }
    
     @Override
    protected void postMain(Form f) {
    super.postMain(f); //To change body of generated methods, choose Tools | Templates.
    
        requeteRestConnexion = new RequetePourTexteBrut();
        requeteRestCommande = new RequetePourArbreXML();
        //requeteRestExploitation.executer("gc/login/{id}{mdp}");
        modeleDuTableau   = new ModeleDeTableau("Mes commandes");      
        tableau = this.findTable();
    
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }

}
