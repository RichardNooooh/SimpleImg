import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class SimpleImg
{
	private BufferedImage image;


	//TODO find best way to deal with the IOException
	public SimpleImg(File input)
	{
		try
		{
			image = ImageIO.read(input);

		} catch(IOException e)
		{
			System.out.println("SOMETHING GOT FUCKED UP IN SimpleImg OBJECT CREATION");
		}
	}

	//TODO allow users to have a url to use this processor
	public SimpleImg(URL url)
	{

	}



	public int getHeight()
	{
		return image.getHeight();
	}

	public int getWidth()
	{
		return image.getWidth();
	}

	public int[][][] getRawImageArray()
	{
		Raster rawImg = image.getData();
		System.out.println(rawImg);
		return null;
	}

	//for testing
	public static void main(String[] args)
	{
		File raw = new File("src/images/weeb.jpg");
		SimpleImg processor = new SimpleImg(raw);
		processor.getRawImageArray();
	}




}
