package C19313276;

import processing.core.*;

public class Galaxy {
    RakshitVisual rv;

    public Galaxy(RakshitVisual rv)
    {
        this.rv = rv;
    }

    public void render()
    {
        float halfWidth = rv.width/2f;
        float height = rv.height;
        
        // galaxy and red pannet
        rv.pushMatrix();
        for(int i = 0 ; i < rv.getAudioBuffer().size() ; i ++)
        {
            rv.stroke(
                PApplet.map(i, 0, rv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );
            rv.strokeWeight(4);
            rv.line((halfWidth-75) + 50 * rv.getAudioBuffer().get(i),i+(height/2), (halfWidth-75), i+(height/2));
            rv.line((halfWidth+20) + 100 * rv.getAudioBuffer().get(i),i+height, (halfWidth + 20), i+height);
            rv.strokeWeight(1);
            rv.noStroke();
            rv.fill(
                PApplet.map(i, 0, rv.getAudioBuffer().size(), 230, 255)
                , 255
                , 255
            );
            rv.rotate(0.50f);
            rv.ellipse(200, 200, 100 + 200 * rv.getAudioBuffer().get(i), 200);
        }
        rv.popMatrix();

        //2nd plannet layer
        rv.pushMatrix();
        for(int i = 0 ; i < rv.getAudioBuffer().size() ; i ++)
        {   
            rv.noStroke();
            rv.fill(
                PApplet.map(i, 0, rv.getAudioBuffer().size(), 25, 40)
                , 255
                , 255
            );
            rv.rotate(0.10f);
            rv.ellipse(100, 100, 100 + 200 * rv.getAudioBuffer().get(i), 200);
        }
        rv.popMatrix();

        //innner most plannet layer
        rv.pushMatrix();
        for(int i = 0 ; i < rv.getAudioBuffer().size() ; i ++)
        {   
            rv.noStroke();
            rv.fill(
                PApplet.map(i, 0, rv.getAudioBuffer().size(), 20, 30)
                , 255
                , 255
            );
            rv.rotate(0.10f);
            rv.ellipse(25, 50, 100 + 200 * rv.getAudioBuffer().get(i), 200);
        }
        rv.popMatrix();

        //innner most plannet layer
        rv.pushMatrix();
        for(int i = 0 ; i < rv.getAudioBuffer().size() ; i ++)
        {   
            rv.stroke(
                PApplet.map(i, 0, rv.getAudioBuffer().size(), 20, 30)
                , 255
                , 255
            );
            rv.noFill();
            rv.rotate(0.10f);
            rv.ellipse(400, 400, 100 + 200 * rv.getAudioBuffer().get(i), 500);
        }
        rv.popMatrix();
    }
}
