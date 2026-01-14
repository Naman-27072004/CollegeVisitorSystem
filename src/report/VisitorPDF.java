package report;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class VisitorPDF {

    public static void generate(String name, String mobile,
            String purpose, String host) {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc,
                    new FileOutputStream("VisitorPass.pdf"));
            doc.open();
            doc.add(new Paragraph("COLLEGE VISITOR PASS"));
            doc.add(new Paragraph("Name: " + name));
            doc.add(new Paragraph("Mobile: " + mobile));
            doc.add(new Paragraph("Purpose: " + purpose));
            doc.add(new Paragraph("Host: " + host));
            doc.add(new Paragraph("Issued On: " + new java.util.Date()));
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
