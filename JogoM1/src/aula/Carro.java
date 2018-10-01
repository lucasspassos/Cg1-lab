/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author glauc
 */
public class Carro extends Base{
    
    public Carro(String url){
       // super(url);       
       img     = new ImageIcon(this.getClass().getResource("/"+url));
       largura = 30;
       altura  = 70;
       rect.height = altura;
       rect.width = largura;
    }
    
    @Override
    public void desenhar(Graphics g){
       
            if(img != null){
                g.drawImage(img.getImage(), x, y, null);
            }
            else{
            
                g.setColor(cor);
                g.fillRect(x, y, largura, altura);
                g.setColor(borda);
                g.drawRect(x, y, largura, altura);  
            
            }
                 
       }

}
