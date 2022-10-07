/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabrieldesouzascopel_lab6_ex2;

/**
 *
 * @author Gabriel Scopel
 * classe MovablePoint implementa a interace Movable
 */
public class MovablePoint implements Movable{
    //posição em x
    int x;
    //posição em y
    int y;
    //velocidade em x
    int xSpeed;
    //velocidade em y
    int ySpeed;
    /*construtor instancia um novo objeto MovablePoint
    @param x. Corresponde a posição x
    @param y. Corresponde a posição y
    @param xSpeed. Corresponde a velocidade em x
    @param ySpeed. Corresponde a valocidade em y
    */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //retorna o valor x
    public int getX() {
        return x;
    }
    //retorna o valor y
    public int getY() {
        return y;
    }
    //retorna o valor de xSpeed
    public int getxSpeed() {
        return xSpeed;
    }
    //retorna o valor de YSped
    public int getySpeed() {
        return ySpeed;
    }
    //retorna o valor das propriedades da classe
    public String toSring(){
        return this.getX()+"-"+this.getY()+"-"+this.getxSpeed()+"-"+this.getySpeed();
    }
    //incrementa ySpeed em y
    @Override
    public void moveUp() {
        this.y=this.y+this.ySpeed;
    }
    //decrementa ySpeed em y
    @Override
    public void moveDown() {
        this.y=this.y-this.ySpeed;
    }
    //decrementa xSpeed em x
    @Override
    public void moveLeft() {
        this.x=this.x-this.xSpeed;
    }
    //incrementa xSpeed em x
    @Override
    public void moveRight() {
        this.x=this.x+this.xSpeed;
    }
    
}
