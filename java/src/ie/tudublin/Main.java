package ie.tudublin;

// import example.CubeVisual;
// import example.MyVisual;
// import example.RotatingAudioBands;
import C19313276.RakshitVisual;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RakshitVisual());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}