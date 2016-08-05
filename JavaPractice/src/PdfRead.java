
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PdfRead {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Kiran\\Desktop\\redBus Ticket _Aug 12_Hyd to Kvz.pdf");

		PDDocument pdf = null;
		String parsedText = null;
		PDFTextStripper stripper;
		pdf = PDDocument.load(file);
		stripper = new PDFTextStripper();
		parsedText = stripper.getText(pdf);
		String[] lines = parsedText.split("\n");
		for(String line:lines){
//			if(line.contains("Id")){
//				System.out.println(line);
//			}
			System.out.println(line);
		}
	}
}