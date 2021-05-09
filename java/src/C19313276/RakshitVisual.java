package C19313276;

import ie.tudublin.*;

public class RakshitVisual extends Visual
{
    Astronaut a1;
    Rocket r1;
    Galaxy g1;

    int option = 0;

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
        if (keyCode >= '0' && keyCode <= '5') {
            option = keyCode - '0';
        }
        if (keyCode == ' ') {
            if (getAudioPlayer().isPlaying()) {
                getAudioPlayer().pause();
            } else {
                getAudioPlayer().rewind();
                getAudioPlayer().play();
            }
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
        switch (option)
        {
            case 0:
            {
                //just load the galaxy
                colorMode(HSB);
                g1.render();
                break;
            }
            case 1:
            {
                //load the galaxy and rocket
                colorMode(HSB);
                g1.render();
                r1.render();
                break;
            }
            case 2:
            {
                //load the galaxy and astronaut
                colorMode(HSB);
                g1.render();

                colorMode(RGB);
                a1.render();
                break;
            }
            case 3:
            {
                //load all visualisers
                colorMode(HSB);
                g1.render();
                r1.render();

                colorMode(RGB);
                a1.render();
                break;
            }
            case 4:
            {
                //just load rocket 
                colorMode(HSB);
                r1.render(); 
                break;   
            }
            case 5:
            {
                //just load the astronaught
                colorMode(RGB);
                a1.render();
                break;
            }
        }
        
    }
    
}
