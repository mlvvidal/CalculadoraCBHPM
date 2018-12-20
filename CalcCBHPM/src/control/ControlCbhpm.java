package control;

import javax.swing.JOptionPane;

public class ControlCbhpm{

    public float total;    
   
    public float calcular(float co, float pmed, float percPort, float uco, float filme, float vfilme){
    
        total = (uco*co) + (pmed * percPort) + (filme * vfilme);
    
        return total;
        
    }
    
}
