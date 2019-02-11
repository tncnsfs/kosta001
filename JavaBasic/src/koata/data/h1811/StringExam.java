package koata.data.h1811;

public class StringExam {
	
	
//	C:\Users\KOSTA\Pictures\Saved Pictures
//	C:\Users\KOSTA\Pictures\Saved Pictures\penguin.jpg
//	penguin.jpg => penguin_small.gif 
	
	
	public static void main(String[] args) {

		String path = "C:\\Users\\KOSTA\\Pictures\\Saved Pictures\\penguin.jpg";
		String fN = path.substring(path.indexOf("penguin"));
		
		String pT = fN.substring(fN.indexOf(".")+1);
		String head2 = fN.substring(0, fN.indexOf("."));
		
		String re_fileName = head2 + "_small." + pT; 
		
		
		
		System.out.println(fN);
		System.out.println(pT);
		System.out.println(re_fileName); 
		
		
		
//		String Img = "pengguin.jpg";

//		String Img1 = Img.substring(0, Img.indexOf("."));
//		String Img2= Img1.concat("_small").concat(".gif");
//		
//		System.out.println(Img1);
//		System.out.println(Img2);
	}
	
	
	

}
