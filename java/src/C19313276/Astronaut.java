package C19313276;

import processing.core.*;

public class Astronaut {
    
    RakshitVisual rv;

    public Astronaut(RakshitVisual rv)
    {
        this.rv = rv;
    }

    public void render()
    {
        int handLength = 200;
        int handWidth = 50;
        int halfHeight = rv.height/2;

        //creating astranaut
        rv.noStroke();
        rv.fill(255);

        //oxygen pipe
        rv.strokeWeight(15);
        rv.stroke(255);
        rv.line(rv.width-230, halfHeight-120, rv.width-225, halfHeight-60);
        rv.line(rv.width-225, halfHeight-60, rv.width-300, halfHeight);
        rv.strokeWeight(1);
        rv.noStroke();

        //left hand
        rv.ellipse(rv.width-500, halfHeight+handWidth, 100, 100);
        rv.rect(rv.width-550, halfHeight+handWidth, handWidth, handLength);
        rv.ellipse(rv.width-250, halfHeight+250, 100, 100);
        //right hand
        rv.ellipse(rv.width-250, halfHeight+handWidth, 100, 100);
        rv.rect(rv.width-250, halfHeight+handWidth, handWidth, handLength);
        rv.ellipse(rv.width-500, halfHeight+250, 100, 100);
        
        
        //main body
        // rv.colorMode(RGB);
        rv.fill(168, 168, 168);
        rv.ellipse(rv.width-375, halfHeight, 230, 100);
        rv.fill(255);
        rv.rect(rv.width-500,halfHeight, 250, 300);
        
        //head
        rv.fill(150, 150, 150);
        rv.ellipse(rv.width-375, halfHeight-120, 320, 100);
        rv.stroke(151, 152, 153);
        rv.fill(255);
        rv.ellipse(rv.width-375, halfHeight-120, 270, 270);
        rv.strokeWeight(1);
        rv.fill(47, 48, 48);
        rv.ellipse(rv.width-375, halfHeight-120, 220, 220);
        
        //hightligting 
        rv.strokeWeight(5);
        rv.line(rv.width-250, halfHeight+100, rv.width-250, halfHeight+300);
        rv.line(rv.width-500, halfHeight+100, rv.width-500, halfHeight+300);

        //lower body
        rv.fill(255);
        rv.noStroke();
        rv.rect(rv.width-500,halfHeight+300, 100, 300);
        rv.rect(rv.width-350,halfHeight+300, 100, 300);
        rv.rect(rv.width-400,halfHeight+300, 50, 100);

        //belt
        rv.fill(168, 168, 168);
        rv.rect(rv.width-500,halfHeight+300, 250, 20);

        //visualiser screen screen
        rv.fill(245, 71, 71);
        rv.rect(rv.width-485, halfHeight+100, 220, 175, 20);
        rv.fill(0);
        rv.rect(rv.width-475, halfHeight+110, 200, 155, 20); 

        float gap = 200 / (float) rv.getBands().length;
        float maxHeight;
        rv.colorMode(3);
        rv.noStroke();
        for(int i = 0 ; i < rv.getBands().length ; i ++)
        {
            rv.fill(PApplet.map(i, 0, rv.getBands().length, 255, 0), 255, 255);
            maxHeight = PApplet.map((rv.getSmoothedBands()[i] * 0.2f), 0, rv.getAudioBuffer().size() , 0, 200);
            rv.rect((rv.width-475)+i * gap, halfHeight+200, gap,-maxHeight); 
        }
    }

}
