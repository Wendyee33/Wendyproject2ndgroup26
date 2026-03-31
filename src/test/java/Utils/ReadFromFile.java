//package utils;
//
//import javax.xml.crypto.Data;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class ReadFromFile {
//
//    private static String test
//    Data=System.getProperty("user.dir")+"/src/test/java/Testdata.testData";
//    public static DataFormatter dataFormatter = new DataFormatter();
//
//    static FileInputStream fs;
//
//    static {
//        try {
//            fs = new FileInputStream(testData)
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e)
//        }
//    }
//
//    static XSSFSheet workbook = new 'XSSFSheetworkbook'(fs);
//
//    static XSSFSheet sheet = ReadFromFile.workbook.getSheet(),
//    public static String email = sheet.getRow(1).getCell(0).getStringCellValue();
//
//    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();
//
//}