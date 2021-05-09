package C19313276;

import processing.core.*;

public class Rocket 
{

    RakshitVisual rv;

    public Rocket(RakshitVisual rv)
    {
        this.rv = rv;
    }
    
    public void render()
    {

        float halfWidth = rv.width/2f;
        float height = rv.height;

        // drawing the rocket.
        rv.fill(358, 200, 255);
        rv.noStroke();
        //bottom triangles
        rv.triangle(halfWidth-30, (height/4)+100, halfWidth-10, (height/4)+100, halfWidth-20, (height/4)+110);
        rv.triangle(halfWidth+30, (height/4)+100, halfWidth+10, (height/4)+100, halfWidth+20, (height/4)+110);
        //rocket wings
        rv.triangle((halfWidth+25), (height/4)+50, halfWidth+25, (height/4)+100, halfWidth+75, (height/4)+150);
        rv.triangle((halfWidth-25), (height/4)+50, halfWidth-25, (height/4)+100, halfWidth-75, (height/4)+150);
        //rocket nose
        rv.triangle(halfWidth-25, height/4, halfWidth+25, height/4, halfWidth, (height/4)-30);
        
        //main body
        rv.fill(255);
        rv.rect(halfWidth-25f, height/4, 50f, 100f);

        //window
        rv.fill(358,255,255);
        rv.stroke(10);
        rv.ellipse(halfWidth, (height/4)+20, 30, 30);
        rv.fill(150, 255, 255);
        rv.ellipse(halfWidth, (height/4)+20, 20, 20);

        //rocket flare 
        for(int i = 0 ; i < rv.getAudioBuffer().size() ; i ++)
        {
            rv.stroke(
                PApplet.map(i, 0, rv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            rv.line((halfWidth-75) + 70 * rv.getAudioBuffer().get(i),i+((height/4)+200), (halfWidth-75), i+((height/4)+150));
            rv.line((halfWidth+75) + 70 * rv.getAudioBuffer().get(i),i+((height/4)+200), (halfWidth+75), i+((height/4)+150)); 
        }
    }
    
}
