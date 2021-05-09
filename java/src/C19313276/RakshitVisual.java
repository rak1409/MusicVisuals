package C19313276;

import ie.tudublin.*;

public class RakshitVisual extends Visual
{
    Astronaut a1;
    Rocket r1;
    Galaxy g1;

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
        
        r1 = new Rocket(this);
        a1 = new Astronaut(this);
        g1 = new Galaxy(this);
    }

    public void keyPressed()
    {
        
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

        colorMode(HSB);
        g1.render();
        r1.render();

        colorMode(RGB);
        a1.render();
        
    }
    
}
