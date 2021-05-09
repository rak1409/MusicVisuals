package C19313276;

import ie.tudublin.*;


public class RakshitVisual extends Visual
{
    public void settings()
    {
        size(1024, 500);
        
        // Use this to make fullscreen
        fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        colorMode(HSB);
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        //loadAudio("heroplanet.mp3");   

        
        // Call this instead to read audio from the microphone
         startListening(); 
        
        
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }


    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        
        float halfWidth = width/2f;
        
        // galaxy and red pannet
        pushMatrix();
        for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        {
            stroke(
                map(i, 0, getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );
            line((halfWidth-75) + 50 * getAudioBuffer().get(i),i+(height/2), (halfWidth-75), i+(height/2));
            line((halfWidth+20) + 100 * getAudioBuffer().get(i),i+height, (halfWidth + 20), i+height);
            noStroke();
            fill(
                map(i, 0, getAudioBuffer().size(), 230, 255)
                , 255
                , 255
            );
            rotate(0.50f);
            ellipse(200, 200, 100 + 200 * getAudioBuffer().get(i), 200);
        }
        popMatrix();

        //2nd plannet layer
        pushMatrix();
        for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        {   
            noStroke();
            fill(
                map(i, 0, getAudioBuffer().size(), 25, 40)
                , 255
                , 255
            );
            rotate(0.10f);
            ellipse(100, 100, 100 + 200 * getAudioBuffer().get(i), 200);
        }
        popMatrix();

        //innner most plannet layer
        pushMatrix();
        for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        {   
            noStroke();
            fill(
                map(i, 0, getAudioBuffer().size(), 20, 30)
                , 255
                , 255
            );
            rotate(0.10f);
            ellipse(25, 50, 100 + 200 * getAudioBuffer().get(i), 200);
        }
        popMatrix();

        // drawing the rocket.
        fill(358, 200, 255);
        noStroke();
        //bottom triangles
        triangle(halfWidth-30, (height/4)+100, halfWidth-10, (height/4)+100, halfWidth-20, (height/4)+110);
        triangle(halfWidth+30, (height/4)+100, halfWidth+10, (height/4)+100, halfWidth+20, (height/4)+110);
        //rocket wings
        triangle((halfWidth+25), (height/4)+50, halfWidth+25, (height/4)+100, halfWidth+75, (height/4)+150);
        triangle((halfWidth-25), (height/4)+50, halfWidth-25, (height/4)+100, halfWidth-75, (height/4)+150);
        //rocket nose
        triangle(halfWidth-25, height/4, halfWidth+25, height/4, halfWidth, (height/4)-30);
        
        //main body
        fill(255);
        rect(halfWidth-25f, height/4, 50f, 100f);

        //window
        fill(358,255,255);
        stroke(10);
        ellipse(halfWidth, (height/4)+20, 30, 30);
        fill(150, 255, 255);
        ellipse(halfWidth, (height/4)+20, 20, 20);

        
    }
    
}
