/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210262_gabrieldesouzascopel_lab6_ex2;

/**
 *
 * @author Gabriel Scopel
 * classe MovableCircle extende a classe MovablePoint e implementa a interface Movable
 */
public class MovableCircle extends MovablePoint implements Movable {
    int radius;
    MovablePoint center;
    //retorna o valor do radio
    public int getRadius() {
        return radius;
    }
    //retorna o valor de center (tipo MovablePoint - composição)
    public MovablePoint getCenter() {
        return center;
    }
    //retorna o valor de x
    @Override
    public int getX() {
        return x;
    }
    //retorna o valor de y
    @Override
    public int getY() {
        return y;
    }
    //retorna o valor de xSpeed
    @Override
    public int getxSpeed() {
        return xSpeed;
    }
    //retorna o valor de ySpeed
    @Override
    public int getySpeed() {
        return ySpeed;
    }
    /*construtor
    instancia um novo objeto MovableCircle
    @param radius. corresponde ao raio
    @param center. corresponde ao centro
    @param x. corresponde a posição do x
    @param y. corresponde a posição y
    @param xSpeed. corresponde a velocidade em x
    @param YSpeed. corresponde a velocidade em y
    */
    public MovableCircle(int radius, MovablePoint center, int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = center;
    }
    //retorna o valor das propriedades separados por "-"
    @Override
    public String toString(){
        return this.getRadius()+"-"+this.getCenter()+"-"+this.getX()+"-"+this.getY()+"-"+this.getxSpeed()+"-"+this.getySpeed();
    }
    //incrementa o valor ySpeed variável y 
    @Override
    public void moveUp() {
        this.y=this.y+ySpeed;
    }
    //decrementa o valor ySpeed variável y 
    @Override
    public void moveDown() {
        this.y=this.y-ySpeed;
    }
    //decrementa o valor xSpeed variável x
    @Override
    public void moveLeft() {
        this.x=this.x-ySpeed;
    }
    //incrementa xSpeed na variável x
    @Override
    public void moveRight() {
        this.x=this.x+xSpeed;
    }
    
}
