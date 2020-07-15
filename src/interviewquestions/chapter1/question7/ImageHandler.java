package interviewquestions.chapter1.question7;

public class ImageHandler {

	public static void main(String[] args) {

		byte[][][] img = { 
				{ { 0, 0, 0, 0 }, { 1, 1, 0, 0}, {2,2,0,0} , {3,3,0,0}}, 
				{ { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, {2,2,1,1} , {3,3,1,1}},
				{ { 0,0, 2, 2 }, { 1, 1, 2, 2 }, {2,2,2,2} , {3,3,2,2}}, 
				{ { 0,0, 3, 3 }, { 1, 1, 3, 3 }, {2,2,3,3} , {3,3,3,3}} };

		printMatrix(img);

		System.out.println("----------------------------------------------------------------");

		printMatrix(rotate90GradesInPlace(img));
		
	}

	public static void printMatrix(byte[][][] matrix) {

		StringBuffer sb = new StringBuffer();
		for (byte[][] bs : matrix) {
			for (byte[] b : bs) {
				sb.append(printBytes(b));
				sb.append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);

	}

	public static String printBytes(byte bytes[]) {

		StringBuffer sb = new StringBuffer();
		for (byte b : bytes) {
			sb.append(b);
		}
		return sb.toString();
	}

	public static byte[][][] rotate90Grades(byte[][][] img) {

		byte[][][] result = new byte[img[0].length][img.length][4];

		for (int x = 0; x < img.length; x++) {

			for (int y = 0; y < img[x].length; y++) {

				result[result.length - 1 - y][x] = img[x][y];

			}

		}

		return result;
	}

	public static byte[][][] rotate90GradesInPlace(byte[][][] img) {
		
		int nIterations = img.length / 2;
		
		for (int j = 0; j < nIterations; j++){  
			
			for (int i = j; i < img.length -1 - j; i++) {
							
				byte[] pixel = img[i + j][j];
						
				img[i + j][j]					 				= img[img.length - 1 - j][i + j];				
				img[img.length - 1 - j][i + j]		 			= img[img.length -1 - i - j][img.length -1 - j];
				img[img.length -1 - i - j][img.length -1 - j] 	= img[j][img.length -1 - i - j];
				img[j][img.length -1 - i - j] 					= pixel;

			}
			
		}

		return img;
	}
}
