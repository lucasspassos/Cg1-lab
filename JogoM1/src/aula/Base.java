/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


/**
 *
 * @author glauc
 */
public abstract class Base {
    
    protected int x = 90;
    protected int y = 0;
    protected int incX = 1;
    protected int incY = 1;
    protected Color cor = Color.BLACK;
    protected Color borda = Color.GREEN;
    protected int largura=30;
    protected int altura=30;
    protected Rectangle rect = new Rectangle(0,0,30,30);
    protected ImageIcon img;
    protected boolean esq;
    protected boolean dir;
    
    public Base(){
    }
    public Base(String url){
       img     = new ImageIcon(this.getClass().getResource("/").getPath()+ url);
       largura = img.getIconWidth();
       altura  = img.getIconHeight();
       rect.height = altura;
       rect.width = largura;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        
        this.x = x;
        this.rect.x = x;
        
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        this.rect.y =y;
    }

    public int getIncX() {
        return incX;
    }

    public void setIncX(int incX) {
        this.incX = incX;
    }

    public int getIncY() {
        return incY;
    }

    public void setIncY(int incY) {
        this.incY = incY;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

 

    public void setLargura(int largura) {
        this.largura = largura;
        this.rect.width = largura;      
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
        this.rect.height = altura;
    }

    public void desenhar(Graphics g){
       
        if(img != null){
            g.drawImage(img.getImage(), x, y, null);
        }
       
    }

    public void mover() {
        y = y + incY;
        
        if(x <= 70){
            x+=1;
            esq = false;
        }
        else
                esq = true;
        if(x >= 420){
            x-=1;
            dir = false;
        }    
        else 
                dir = true;
        
        if(esq && dir)
            x = x + incX;
        else if(!esq)
            if(incX>0)
                x = x + incX;
        else if(!dir)
            if(incX<0)
                x = x + incX;

        this.rect.x= x;
        this.rect.y = y;
    }
    
    public boolean colisao(Base outraBase){
        if(this.equals(outraBase))
            return false;
        else            
            return rect.intersects(outraBase.rect);
    }

}
