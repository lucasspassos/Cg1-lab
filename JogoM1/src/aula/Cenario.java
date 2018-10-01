/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.awt.Color;
import java.awt.Graphics;


public class Cenario {
      
    private int posy;
    
     public int getPosy() {
        return posy;
    }
    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    public Cenario(){
        
        posy=0;
        
    }
    
    public void criaFundo(Graphics g,int xtela, int ytela){
    
           g.setColor(Color.DARK_GRAY);
           g.fillRect(0,0,xtela,ytela);
           
           //Desenha a calçada
           g.setColor(Color.LIGHT_GRAY);
           g.fillRect(40, 0, 30 ,ytela );
           g.setColor(Color.LIGHT_GRAY);
           g.fillRect(460, 0, 30 ,ytela );
           
           //Desenha emenda da calçada esquerda
           g.setColor(Color.gray);
           g.fillRect(40,posy,30,10);
           
                    
           //Desenha emenda da calçada dir
           g.setColor(Color.gray);
           g.fillRect(460,posy,30,10);
           
           //cria faixa esq
           g.setColor(Color.white);
           g.fillRect(180,posy,20,100);     
           
            //cria faixa dir
           g.setColor(Color.white);
           g.fillRect(310,posy,20,100);
           
    }
    
    public void moveCen(int incremento){       
        
        this.posy += incremento; 
    }
}