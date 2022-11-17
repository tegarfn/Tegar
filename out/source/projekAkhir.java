/* autogenerated by Processing revision 1286 on 2022-11-17 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class projekAkhir extends PApplet {

int speed = 5000;
kereta krt = new kereta(0,0);

 public void setup() {
    /* size commented out by preprocessor */;
}

 public void draw() {
    background(200);
    translate(width/2, height/2);
    scale(0.25f);
    noFill();
    noStroke();

    krt.kepala(speed,-100);
    for(int i = 500; i <= 2500; i += 500){
        krt.gerbong(speed+i,-100);
    }

    if(speed < -10000){
        speed = 5000;
    }else{
        speed -= 100;   
    }
    
    for(int i = -4000; i <= 3500; i += 500){
        krt.railway(i,0);
    }
}
public class kereta {
    int locX;
    int locY;

    public kereta(int tlocX, int tlocY){
        locX = tlocX;
        locY = tlocY;
    }
    
     public void gerbong(int locX, int locY){
        fill(240);
        rect(locX,locY,480,120,35,35,10,10);
        fill(100);
        rect(locX+40,locY+20,320,40,5);
        fill(0,200,225);
        for(int i = 45; i < 320; i += 45){
            rect(locX+i,locY+25,40,30,5);
        }
        fill(0,0,255);
        rect(locX,locY+95,480,25,0,0,10,10);
        strokeCap(SQUARE);
        strokeWeight(8);
        stroke(255,0,0);
        line(locX,locY+80,locX+480,locY+80);
        noStroke();
        fill(50,50,50,30);
        rect(locX+375,locY+20,50,100,5);
        fill(0,200,225);
        rect(locX+380,locY+25,40,30,5);
        fill(50);
        rect(locX+480,locY+100,20,10);
    }

     public void kepala(int locX, int locY){
        fill(240);
        rect(locX,locY+75,10,10);

        beginShape();
            vertex(locX+160,locY);
            vertex(locX+160,locY+120);
            vertex(locX+10,locY+120);
            vertex(locX,locY+110);
            vertex(locX,locY+75);
            bezierVertex(locX, locY+50, locX+100, locY, locX+160, locY);
        endShape();

        beginShape();
            fill(0,200,225);
            vertex(locX+140,locY+20);
            vertex(locX+140,locY+65);
            vertex(locX+40,locY+65);
            bezierVertex(locX+40,locY+55,locX+110,locY+20,locX+140,locY+20);
        endShape();

        fill(240);
        rect(locX+160,locY,320,120,0,35,10,10);
        fill(100);
        rect(locX+240,locY+20,185,40,5);
        fill(0,200,225);
        for(int i = 245; i < 400; i += 45){
            rect(locX+i,locY+25,40,30,5);
        }
        fill(0,0,255);
        rect(locX,locY+95,480,25,0,0,10,10);
        strokeCap(SQUARE);
        strokeWeight(8);
        stroke(255,0,0);
        line(locX,locY+80,locX+480,locY+80);
        noStroke();
        fill(50,50,50,30);
        rect(locX+175,locY+20,50,100,5);
        fill(0,200,225);
        rect(locX+180,locY+25,40,30,5);
        fill(50);
        rect(locX+480,locY+100,20,10);
    }

     public void railway(int locX, int locY){
        noStroke();
        fill(120);
        rect(locX,locY,500,15);
        fill(70);
        rect(locX,locY+15,500,10);
        strokeWeight(10);
        stroke(100);
        line(locX+100,locY+25,locX+100,locY+160);
        line(locX+200,locY+25,locX+200,locY+120);
        line(locX+300,locY+25,locX+300,locY+160);

        noFill();
        beginShape();
            vertex(locX,locY+250);
            vertex(locX+100,locY+160);
            vertex(locX+200,locY+120);
            vertex(locX+300,locY+160);
            vertex(locX+400,locY+250);
        endShape();

        noStroke();
        fill(100);
        rect(locX+400,locY+25,100,500);
        fill(85);
        rect(locX+425,locY+25,50,300);
        fill(80);
        rect(locX+390,locY+275,120,60);
        fill(120);
        quad(locX+300,locY+25,locX+400,locY+75,locX+500,locY+75,locX+600,locY+25);

        stroke(80);
        for(int i = 0; i < 500; i += 50){
            line(locX+i,locY-25,locX+i+50,locY);
            line(locX+i,locY,locX+i+50,locY-25);
        }
        noStroke();
        fill(120);
        rect(locX,locY-35,500,10);
    }
}


  public void settings() { size(1920, 1080); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "projekAkhir" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
