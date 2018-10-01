/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.awt.Graphics;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author glauc
 */
public class Obstaculo extends Base {
    
    public Obstaculo(String url){
       // super(url);       
       img     = new ImageIcon(this.getClass().getResource("/"+url));
       largura = 30;
       altura  = 30;
       rect.height = altura;
       rect.width = largura;
    }
    
    
    
    @Override
    public void desenhar(Graphics g){
        if(img != null){
                g.drawImage(img.getImage(), x-20, y, null);
            }
            else{
                g.setColor(cor);
                g.fillOval(x, y, largura, altura);  
            
            }
        
    }
    
}

/*

public class Obstaculo extends Base {
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(corBuraco);
        g.fillOval(x, y, largura, altura);
    }
    
}




*/
