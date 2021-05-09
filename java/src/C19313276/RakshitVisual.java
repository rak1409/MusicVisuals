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
        colorMode(HSB);
        strokeWeight(1);
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
        
        // // galaxy and red pannet
        // pushMatrix();
        // for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        // {
        //     stroke(
        //         map(i, 0, getAudioBuffer().size(), 0, 255)
        //         , 255
        //         , 255
        //     );
        //     line((halfWidth-75) + 50 * getAudioBuffer().get(i),i+(height/2), (halfWidth-75), i+(height/2));
        //     line((halfWidth+20) + 100 * getAudioBuffer().get(i),i+height, (halfWidth + 20), i+height);
        //     noStroke();
        //     fill(
        //         map(i, 0, getAudioBuffer().size(), 230, 255)
        //         , 255
        //         , 255
        //     );
        //     rotate(0.50f);
        //     ellipse(200, 200, 100 + 200 * getAudioBuffer().get(i), 200);
        // }
        // popMatrix();

        // //2nd plannet layer
        // pushMatrix();
        // for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        // {   
        //     noStroke();
        //     fill(
        //         map(i, 0, getAudioBuffer().size(), 25, 40)
        //         , 255
        //         , 255
        //     );
        //     rotate(0.10f);
        //     ellipse(100, 100, 100 + 200 * getAudioBuffer().get(i), 200);
        // }
        // popMatrix();

        // //innner most plannet layer
        // pushMatrix();
        // for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        // {   
        //     noStroke();
        //     fill(
        //         map(i, 0, getAudioBuffer().size(), 20, 30)
        //         , 255
        //         , 255
        //     );
        //     rotate(0.10f);
        //     ellipse(25, 50, 100 + 200 * getAudioBuffer().get(i), 200);
        // }
        // popMatrix();

        // // drawing the rocket.
        // fill(358, 200, 255);
        // noStroke();
        // //bottom triangles
        // triangle(halfWidth-30, (height/4)+100, halfWidth-10, (height/4)+100, halfWidth-20, (height/4)+110);
        // triangle(halfWidth+30, (height/4)+100, halfWidth+10, (height/4)+100, halfWidth+20, (height/4)+110);
        // //rocket wings
        // triangle((halfWidth+25), (height/4)+50, halfWidth+25, (height/4)+100, halfWidth+75, (height/4)+150);
        // triangle((halfWidth-25), (height/4)+50, halfWidth-25, (height/4)+100, halfWidth-75, (height/4)+150);
        // //rocket nose
        // triangle(halfWidth-25, height/4, halfWidth+25, height/4, halfWidth, (height/4)-30);
        
        // //main body
        // fill(255);
        // rect(halfWidth-25f, height/4, 50f, 100f);

        // //window
        // fill(358,255,255);
        // stroke(10);
        // ellipse(halfWidth, (height/4)+20, 30, 30);
        // fill(150, 255, 255);
        // ellipse(halfWidth, (height/4)+20, 20, 20);

        // //rocket flare 
        // for(int i = 0 ; i < getAudioBuffer().size() ; i ++)
        // {
        //     stroke(
        //         map(i, 0, getAudioBuffer().size(), 0, 255)
        //         , 255
        //         , 255
        //     );

        //     line((halfWidth-75) + 70 * getAudioBuffer().get(i),i+((height/4)+200), (halfWidth-75), i+((height/4)+150));
        //     line((halfWidth+75) + 70 * getAudioBuffer().get(i),i+((height/4)+200), (halfWidth+75), i+((height/4)+150)); 
        // }

        int handLength = 200;
        int handWidth = 50;
        int halfHeight = height/2;

        //creating astranaut
        noStroke();
        fill(255);

        //oxygen pipe
        strokeWeight(15);
        stroke(255);
        line(width-230, halfHeight-120, width-225, halfHeight-60);
        line(width-225, halfHeight-60, width-300, halfHeight);
        strokeWeight(1);
        noStroke();

        //left hand
        ellipse(width-500, halfHeight+handWidth, 100, 100);
        rect(width-550, halfHeight+handWidth, handWidth, handLength);
        ellipse(width-250, halfHeight+250, 100, 100);
        //right hand
        ellipse(width-250, halfHeight+handWidth, 100, 100);
        rect(width-250, halfHeight+handWidth, handWidth, handLength);
        ellipse(width-500, halfHeight+250, 100, 100);
        
        
        //main body
        colorMode(RGB);
        fill(168, 168, 168);
        ellipse(width-375, halfHeight, 230, 100);
        fill(255);
        rect(width-500,halfHeight, 250, 300);
        
        //head
        fill(150, 150, 150);
        ellipse(width-375, halfHeight-120, 320, 100);
        stroke(151, 152, 153);
        fill(255);
        ellipse(width-375, halfHeight-120, 270, 270);
        strokeWeight(1);
        fill(47, 48, 48);
        ellipse(width-375, halfHeight-120, 220, 220);
        
        //hightligting 
        strokeWeight(5);
        line(width-250, halfHeight+100, width-250, halfHeight+300);
        line(width-500, halfHeight+100, width-500, halfHeight+300);

        //lower body
        fill(255);
        noStroke();
        rect(width-500,halfHeight+300, 100, 300);
        rect(width-350,halfHeight+300, 100, 300);
        rect(width-400,halfHeight+300, 50, 100);

        //belt
        fill(168, 168, 168);
        rect(width-500,halfHeight+300, 250, 20);

        //visualiser screen screen
        fill(245, 71, 71);
        rect(width-475, halfHeight+100, 200, 175, 20);
        fill(0);
        rect(width-465, halfHeight+110, 180, 155, 20); 
        
        
    }
    
}
