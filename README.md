# Music Visualiser Project

Name: Rakshit Nautiyal

Student Number: C19313276

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
My assignment is based on the theme of outer space. Using java and visual studio, I have created a program that visualises sound. I have used different objects from the outer space to represent these sounds. 

# Instructions
There are 6 options available in this program.
Press:
- 0 - This loads the galaxy view.
- 1 - This loads the galaxy and rocket view.
- 2 - This loads the galaxy and astronaut view.
- 3 - This loads all the views together.
- 4 - This loads the rocket view.
- 5 - This loads the astronaut view.

# How it works
This program works by taking a digital audio sample from either a stored audio file or from a microphone. Using the minim and FTT libraries in java this program takes samples from the audio and then this data is used to visualise these sound waves. Using the PApplet class in java these wave forms can be visuallised.FTT allows us to seperate the different frequencies of sound. Using shapes, lines and various corlor range some really awsome anomations can created. All of these have been implemented in this assignment.

# What I am most proud of in the assignment
The project turned out to better than I thought, as I was really suffering with time management. I was delighted do develop something that was associated with my other major intrest in outer space and galaxies. I would definately use this visulaiser when listening to songs. Check out the demo video of the program: [Click Here!](https://youtu.be/5KLG1Qj9OFc).

# Snapshots
![image1](https://user-images.githubusercontent.com/71874640/117583189-a9fbd480-b0fd-11eb-931d-cff4f0225fbe.png)
![image2](https://user-images.githubusercontent.com/71874640/117583196-b54f0000-b0fd-11eb-9897-3fcf77ce61c5.png)
![image3](https://user-images.githubusercontent.com/71874640/117583202-c6980c80-b0fd-11eb-8e96-de0908078ae4.png)
![image4](https://user-images.githubusercontent.com/71874640/117583206-cd268400-b0fd-11eb-8015-de5d0450117b.png)
![image5](https://user-images.githubusercontent.com/71874640/117583215-d9124600-b0fd-11eb-9964-b9b9b3193bbd.png)
![image6](https://user-images.githubusercontent.com/71874640/117583221-e4fe0800-b0fd-11eb-9660-b5087855d74d.png)


# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

